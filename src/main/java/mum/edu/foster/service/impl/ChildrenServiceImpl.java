package mum.edu.foster.service.impl;

import java.util.Date;
import java.util.List;

import mum.edu.foster.dao.ChildrenDAO;
import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;
import mum.edu.foster.service.ChildrenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildrenServiceImpl implements ChildrenService {

	@Autowired
	private ChildrenDAO childrenDao;

	public ChildrenServiceImpl(ChildrenDAO childrenDao) {
		this.childrenDao = childrenDao;
	}

	@Override
	public List<Person> findByLastName(String lastName) {
		return null;
		// childrenDao.findByLastName(lastName);
	}

	@Override
	public List<Person> findByDateofBirth(Date dob) {
		return null;
		// childrenDao.findByDob();
	}

	@Override
	public void delete(long id) {
		childrenDao.delete(id);
	}

	@Override
	public Person findById(Long id) {
		return childrenDao.findOne(id);
	}

	@Override
	public List<Person> findAll() {
		System.out.println("Calling from controller!");
		return childrenDao.findAll();
	}

	@Override
	public long save(Person children) {

		return childrenDao.save(children).getId();;
	}

	@Override
	public Person displayDetail(long id) {

		return childrenDao.displayDetail(id);
	}

	@Override
	public List<Person> findByFistName(String firstName) {
		// TODO Auto-generated method stub
		return childrenDao.findByFirstName(firstName);
	}
}
