package mum.edu.foster.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mum.edu.foster.dao.SupportNeedDAO;
import mum.edu.foster.domain.SupportNeed;
import mum.edu.foster.service.SupportNeedService;

public class SupportNeedServiceImpl implements SupportNeedService {
	
	@Autowired
	private SupportNeedDAO supportNeedDao;
	
	
	@Override
	public void delete(SupportNeed supportNeed) {
		supportNeedDao.delete(supportNeed);
	}

	@Override
	public List<SupportNeed> getAll() {
		return supportNeedDao.findAll();
	}

	@Override
	public SupportNeed getById(Long id) {
		return supportNeedDao.findOne(id);
	}


	@Override
	public Long save(SupportNeed supportNeed) {
		return supportNeedDao.save(supportNeed).getId();
	}


}
