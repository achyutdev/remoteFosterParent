package mum.edu.foster.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.foster.domain.Person;

@Repository
public interface FosterParentDAO extends JpaRepository<Person, Long> {

	public List<Person> findByFirstName(String firstName);

	public List<Person> findByLastName(String lastName);

/*	@Query("SELECT f FROM FosterParent f join f.Support s join s.Donation d WHERE f.id = ?")
	public Person displayDetail(long id);*/
	
}
