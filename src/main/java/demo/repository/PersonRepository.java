package demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import demo.model.Person;

@Repository
//RestResource
public interface PersonRepository extends CrudRepository<Person, Long> {

	
	public Person findByLastName(String lastName);
	
	
	@Query("select pr from Person pr where pr.firstName = :firstName and pr.lastName = :lastName")
	List<Person> findByPerson(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
