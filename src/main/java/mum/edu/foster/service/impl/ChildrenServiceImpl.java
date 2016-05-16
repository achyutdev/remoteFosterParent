package mum.edu.foster.service.impl;

import java.util.Date;
import java.util.List;

import mum.edu.foster.dao.ChildrenDAO;
import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;
import mum.edu.foster.service.ChildrenService;

public class ChildrenServiceImpl implements ChildrenService {

	private ChildrenDAO childrenDao;

	@Override
	public boolean add() {
		// TODO Auto-generated method stub
//auto generat
		return false;
	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return childrenDao.findAll();
	}

	@Override
	public List<Person> getChildrenByFistName(String firstName) {
		// TODO Auto-generated method stub
		return childrenDao.findByFirstName(firstName);
	}

	@Override
	public List<Person> getChildrenByLastName(String lastName) {
		// TODO Auto-generated method stub
		return childrenDao.findByLastName(lastName);
	}

	@Override
	public List<Person> getByEducationslStatus(String educationalStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getByDateofBirth(Date dob) {
		// TODO Auto-generated method stub
		return childrenDao.findByDob();
	}

	@Override
	public boolean update(Children children) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return childrenDao.delete(id);
	}

	@Override
	public Person getChildrenById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
