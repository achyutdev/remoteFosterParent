package mum.edu.foster.dao;

import java.util.List;

import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenDAO extends JpaRepository<Person, Long> {

	public List<Person> findAll();

	public List<Person> findByDob();

	public Person findById(long id);

	public List<Person> findByFirstName(String firstName);

	public List<Person> findByLastName(String lastName);

	// public List<Person> findByEducationalStatusChildrens(String
	// educationalStatus);

	public boolean delete(long id);
}
