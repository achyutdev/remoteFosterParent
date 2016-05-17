package mum.edu.foster.service.impl;

import java.util.Date;
import java.util.List;

import mum.edu.foster.dao.DonationDAO;
import mum.edu.foster.domain.Donation;
import mum.edu.foster.service.DonationService;

import org.springframework.beans.factory.annotation.Autowired;

public class DonationServiceImpl implements DonationService {

	@Autowired
	private DonationDAO donationDao;

	@Override
	public List<Donation> findAll() {
		// TODO Auto-generated method stub
		return donationDao.findAll();
	}

	@Override
	public List<Donation> findByAmount(double amount) {
		// TODO Auto-generated method stub
		return donationDao.findAll();
	}

	@Override
	public List<Donation> findByDate(Date date) {
		// TODO Auto-generated method stub
		return donationDao.findByDate(date);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		donationDao.delete(id);

	}

	@Override
	public long save(Donation donation) {
		// TODO Auto-generated method stub
		return donationDao.save(donation).getId();
	}

}
