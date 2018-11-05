package demo.implementation;

import java.util.List;

import org.springframework.stereotype.Component;

import demo.model.Person;

@Component
public interface IPersonService {
	
	List<Person> retrievePersons();
	Person savePersion(Person person);
	Person retrieveByLastName(String lastName);
	List<Person> retrievePerson(String firstName, String lastName);

}
