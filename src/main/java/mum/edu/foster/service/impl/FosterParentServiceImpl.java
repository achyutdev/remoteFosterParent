package mum.edu.foster.service.impl;

import java.util.List;

import mum.edu.foster.dao.FosterParentDAO;
import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.service.FosterParentService;

public class FosterParentServiceImpl implements FosterParentService{

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
	public List<FosterParent> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FosterParent getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
