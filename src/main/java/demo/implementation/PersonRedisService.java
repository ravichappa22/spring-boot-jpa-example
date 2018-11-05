package demo.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import demo.model.Person;

@Service
@Profile("redis")
public class PersonRedisService implements IPersonService {
	
	@Autowired
	private RedisTemplate<String, Person> redisTemplate;

	@Override
	public List<Person> retrievePersons() {
		List<Person> personList = new ArrayList<>();
		System.out.println(redisTemplate.keys("*").size());
		
		
		for(String  key : redisTemplate.keys("*")) {
			personList.add(retrieveByLastName(key));
		}
			
		
		return personList;
	}

	@Override
	public Person savePersion(Person person) {
		redisTemplate.opsForValue().set(person.getLastName(),person);
		return retrieveByLastName(person.getLastName());
	}

	@Override
	public Person retrieveByLastName(String lastName) {
		return redisTemplate.opsForValue().get(lastName);
	}

	@Override
	public List<Person> retrievePerson(String firstName, String lastName) {
		return null;
	}

}
