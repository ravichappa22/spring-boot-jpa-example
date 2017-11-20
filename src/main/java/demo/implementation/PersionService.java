package demo.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.model.Person;
import demo.repository.PersonRepository;

@Service
public class PersionService {
	
	@Autowired
	private PersonRepository personRepo;
	
	public List<Person> retrievePersons(){
		Iterator<Person> persons =personRepo.findAll().iterator();
		List<Person> personList = new ArrayList<Person>();
		while(persons.hasNext()) {
			personList.add(persons.next());
		}
		return personList;
	}
	
	
	public Person savePersion(Person person) {
	    personRepo.save(person);
	    return person;
	}
	
	
	public Person retrieveByLastName(String lastName) {
		return personRepo.findByLastName(lastName);
	}
	
	public List<Person> retrievePerson(String firstName, String lastName) {
		return personRepo.findByPerson(firstName, lastName);
	}

}
