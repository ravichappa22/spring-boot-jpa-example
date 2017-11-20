package demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.implementation.PersionService;
import demo.model.Person;

@RestController
public class PersonController {
	
	@Autowired
	private  PersionService personService;
	
	@RequestMapping(value="/persons")
	public List<Person> retrievePersons(){
		
		return personService.retrievePersons();
	}
	
	@RequestMapping(value="/person", produces="application/json")
	public Person savePersons(@RequestBody Person person){
		
		 return personService.savePersion(person);
	}
	
	@RequestMapping(value="/lastname/{name}", produces="application/json")
	public Person savePersons(@PathVariable String name){
		
		 return personService.retrieveByLastName(name);
	}
	
	@RequestMapping(value="/name/{firstName}/{lastName}", produces="application/json")
	public List<Person> findPersons(@PathVariable String firstName, @PathVariable String lastName){
		
		 return personService.retrievePerson(firstName, lastName);
	}

}
