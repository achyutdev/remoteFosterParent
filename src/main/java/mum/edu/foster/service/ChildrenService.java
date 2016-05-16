package mum.edu.foster.service;

import java.util.Date;
import java.util.List;

import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;

public interface ChildrenService {

	public boolean add();

	public List<Person> findAll();

	public Person findChildrenById(Long id);

	public List<Person> findChildrenByFistName(String firstName);

	public List<Person> findChildrenByLastName(String lastName);

	public List<Person> findByEducationslStatus(String educationalStatus);

	public List<Person> findByDateofBirth(Date dob);

	public boolean update(Children children);

	public boolean delete(long id);


}
