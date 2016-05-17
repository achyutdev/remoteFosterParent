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

<<<<<<< HEAD
	@Override
	public boolean add() {
		// TODO Auto-generated method stub
//auto generat
		return false;
=======
	@Autowired
	public ChildrenServiceImpl(ChildrenDAO childrenDao) {
		this.childrenDao = childrenDao;
>>>>>>> 42e94491fc761d88bc1ee413db1080a917b86620
	}
	
	@Override
	public List<Person> findChildrenByFistName(String firstName) {
		// TODO Auto-generated method stub
		return null;
//		childrenDao.findByFirstName(firstName);
	}

	@Override
	public List<Person> findChildrenByLastName(String lastName) {
		return null;
//		childrenDao.findByLastName(lastName);
	}

	/* @Override */
	/*
	 * public List<Person> findByEducationslStatus(String educationalStatus) {
	 * // TODO Auto-generated method stub return childrenDao.findb; }
	 */

	@Override
	public List<Person> findByDateofBirth(Date dob) {
		return null;
//		childrenDao.findByDob();
	}

	@Override
	public void delete(long id) {
		childrenDao.delete(id);
	}

	@Override
	public Person findChildrenById(Long id) {
		return childrenDao.findOne(id);
	}

	@Override
	public List<Person> findAll() {
		System.out.println("Calling from controller!");
		return childrenDao.findAll();
	}

	@Override
	public long save(Children children) {

		return childrenDao.save(children).getId();
	}
}
