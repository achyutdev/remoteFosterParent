package mum.edu.foster.dao;

import java.util.List;

import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenDAO extends JpaRepository<Person, Long> {

	public long save(Children children);

	public Person findById(long id);

	public List<Person> findByFirstName(String firstName);

	public List<Person> findByLastName(String lastName);

	@Query("SELECT c FROM Children c join c.supportNeed s join c.expenditure e WHERE c.id = ?")
	public Person displayDetail(long id);

}
