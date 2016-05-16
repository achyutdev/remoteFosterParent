package mum.edu.foster.service.impl;

import java.util.Date;
import java.util.List;

import mum.edu.foster.dao.DonationDAO;
import mum.edu.foster.domain.Donation;
import mum.edu.foster.service.DonationService;

public class DonationServiceImpl implements DonationService {

	private DonationDAO donationDao;

	@Override
	public List<Donation> getAll() {
		// TODO Auto-generated method stub
		return donationDao.findAll();
	}

	@Override
	public boolean add(Donation donation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Donation> getByAmount(double amount) {
		// TODO Auto-generated method stub
		return donationDao.findAll();
	}

	@Override
	public List<Donation> getByDonationDate(Date date) {
		// TODO Auto-generated method stub
		return donationDao.findByDonatedDate();
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
