package mum.edu.foster.service.impl;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.foster.dao.ExpenditureDAO;
import mum.edu.foster.domain.Expenditure;
import mum.edu.foster.service.ExpenditureService;

@Service
public class ExpenditureServiceImpl implements ExpenditureService {

	@Autowired
	private ExpenditureDAO expinditureDao;

	@Override
	public List<Expenditure> findAll() {

		return expinditureDao.findAll();
	}

	@Override
	public long save(Expenditure expenditure) {

		return expinditureDao.save(expenditure).getId();
	}

	@Override
	public void delete(long id) {
		expinditureDao.delete(id);

	}
	@Override
	public List<Expenditure> findByCategory(String category) {

		return expinditureDao.findByCategory(category);
	}

	@Override
	public List<Expenditure> findByAmount(double amount) {
		return expinditureDao.findByAmount(amount);
	}
}
