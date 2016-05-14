package mum.edu.foster.service;

import java.util.Date;
import java.util.List;

import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;

public interface ChildrenService {

	public boolean add();

	public List<Person> getAll();

	public Person getChildrenById(Long id);

	public List<Person> getChildrenByFistName(String firstName);

	public List<Person> getChildrenByLastName(String lastName);

	public List<Person> getByEducationslStatus(String educationalStatus);

	public List<Person> getByDateofBirth(Date dob);

	public boolean update(Children children);

	public boolean delete(long id);

}
