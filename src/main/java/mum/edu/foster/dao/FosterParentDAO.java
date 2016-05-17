package mum.edu.foster.dao;

import java.util.List;

import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.domain.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FosterParentDAO extends JpaRepository<Person, Long> {

	public Person findById(long id);

	public List<Person> findAll();

	public List<Person> findByFirstName();

	public List<Person> findByLastName();

	@Query("SELECT f FROM FosterParent f join f.Support s join s.Donation d WHERE f.id = ?")
	public Person displayDetail(long id);

}
