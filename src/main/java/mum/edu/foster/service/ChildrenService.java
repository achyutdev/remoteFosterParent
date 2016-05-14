package mum.edu.foster.service;

import java.util.List;

import mum.edu.foster.domain.Person;

public interface ChildrenService {

	public void addChildren();

	public Person getChildrenById(Long id);

	public Person getChildrenByName(String firstName);

	public List<Person> getAll();

}
