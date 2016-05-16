package mum.edu.foster.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.foster.dao.ChildrenDAO;
import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;
import mum.edu.foster.service.ChildrenService;

@Service
public class ChildrenServiceImpl implements ChildrenService {

	private ChildrenDAO childrenDao;

	@Override
	public boolean add() {
		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public List<Person> findChildrenByFistName(String firstName) {
		// TODO Auto-generated method stub
		return childrenDao.findByFirstName(firstName);
	}

	@Override
	public List<Person> findChildrenByLastName(String lastName) {
		// TODO Auto-generated method stub
		return childrenDao.findByLastName(lastName);
	}

	@Override
	public List<Person> findByEducationslStatus(String educationalStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findByDateofBirth(Date dob) {
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
	public Person findChildrenById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		System.out.println("Calling from controller!");
		return childrenDao.findAll();
	}

}
