package mum.edu.foster.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.foster.dao.FosterParentDAO;
import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.domain.Person;
import mum.edu.foster.service.FosterParentService;
@Service
public class FosterParentServiceImpl implements FosterParentService {

	@Autowired
	private FosterParentDAO fosterParentDao;

	@Override
	public Long save(FosterParent fosterParent) {
		return fosterParentDao.save(fosterParent).getId();
	}

	@Override
	public void delete(FosterParent fosterParent) {
		fosterParentDao.delete(fosterParent);
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return fosterParentDao.findAll();
	}

	@Override
	public Person findById(Long id) {
		// TODO Auto-generated method stub
		return fosterParentDao.findById(id);
	}

	@Override
	public Person displayDetail(Long id) {
		// TODO Auto-generated method stub
		return fosterParentDao.displayDetail(id);
	}

}
