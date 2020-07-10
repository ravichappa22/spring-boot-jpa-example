package demo.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import demo.model.Person;
import demo.repository.PersonRepository;

/**
 * This service calls the DB directly for storing data
 * @author CORP\rchappa1
 *
 */
@Service
@Profile("default")
public class PersionService implements IPersonService{
	
	@Value("${env.prop.def.prop:novalue}")
	private String defProp;
	@Value("${message.user:}")
	private String messageuser;
	@Value("${message.password:}")
	private String messagepassword;
	
	@Autowired
	private PersonRepository personRepo;
	
	public List<Person> retrievePersons(){
		System.out.println("defProp =" + defProp + "message user=" + messageuser + "message password = " + messagepassword);
		Iterator<Person> persons =personRepo.findAll().iterator();
		List<Person> personList = new ArrayList<Person>();
		while(persons.hasNext()) {
			personList.add(persons.next());
		}
		return personList;
	}
	
	
	public Person savePersion(Person person) {
		System.out.println("defProp =" + defProp + "message user=" + messageuser + "message password = " + messagepassword);
	    personRepo.save(person);
	    return person;
	}
	
	
	public Person retrieveByLastName(String lastName) {
		System.out.println("defProp =" + defProp + "message user=" + messageuser + "message password = " + messagepassword);

		return personRepo.findByLastName(lastName);
	}
	
	public List<Person> retrievePerson(String firstName, String lastName) {
		System.out.println("defProp =" + defProp + "message user=" + messageuser + "message password = " + messagepassword);

		return personRepo.findByPerson(firstName, lastName);
	}

}
