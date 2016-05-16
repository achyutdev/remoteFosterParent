package mum.edu.foster.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;

@Service
public interface ChildrenService {

	public long save(Children children);

	public List<Person> findAll();

	public Person findChildrenById(Long id);

	public List<Person> findChildrenByFistName(String firstName);

	public List<Person> findChildrenByLastName(String lastName);

	/* public List<Person> findByEducationslStatus(String educationalStatus); */

	public List<Person> findByDateofBirth(Date dob);

	public void delete(long id);

}
