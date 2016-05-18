package mum.edu.foster.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.foster.domain.Donation;
import mum.edu.foster.domain.FosterParent;

@Service
public interface DonationService {


	public List<Donation> findAll();

	public List<Donation> getByAmount(double amount);

	public List<Donation> getByDonationDate(Date date);

	public void delete(long id);

	public long save(Donation donation);

	List<Donation> findByAmount(double amount);
	public List<FosterParent> findDetailAll();

}
