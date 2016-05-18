package mum.edu.foster.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.foster.dao.ChildrenDAO;
import mum.edu.foster.domain.Children;
import mum.edu.foster.service.ChildrenService;

@Service
public class ChildrenServiceImpl implements ChildrenService {
	

	@Autowired
	private ChildrenDAO childrenDao;
	/*
	public ChildrenServiceImpl()
	{}
	*/
	@Autowired
	public ChildrenServiceImpl(ChildrenDAO childrenDao) {
		this.childrenDao = childrenDao;
	}

	@Override
	public List<Children> findByLastName(String lastName) {
		return null;
		// childrenDao.findByLastName(lastName);
	}

	@Override
	public List<Children> findByDateofBirth(Date dob) {
		return null;
		// childrenDao.findByDob();
	}

	@Override
	public void delete(long id) {
		childrenDao.delete(id);
	}

	
	public Children findById(Long id) {
		return childrenDao.findOne(id);
	}

	@Override
	public List<Children> findAll() {
		System.out.println("Calling from controller!");
		return childrenDao.findAll();
	}

	@Override
	public long save(Children children) {

		return childrenDao.save(children).getId();
	}

/*	@Override
	public Children displayDetail(long id) {

		return childrenDao.displayDetail(id);
	}
*/
	@Override
	public List<Children> findByFistName(String firstName) {
		// TODO Auto-generated method stub
		return childrenDao.findByFirstName(firstName);
	}
}
