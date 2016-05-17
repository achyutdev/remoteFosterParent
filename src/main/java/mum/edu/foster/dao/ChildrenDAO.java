package mum.edu.foster.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;

@Repository
public interface ChildrenDAO extends JpaRepository<Children, Long> {


	public List<Person> findByFirstName(String firstName);

	public List<Person> findByLastName(String lastName);


}
