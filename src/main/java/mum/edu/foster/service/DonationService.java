package mum.edu.foster.service;

import java.util.Date;
import java.util.List;

import mum.edu.foster.domain.Donation;

public interface DonationService {

	public List<Donation> getAll();

	public boolean add(Donation donation);

	public List<Donation> getByAmount(double amount);

	public List<Donation> getByDonationDate(Date date);

	public boolean update(Donation donation);

	public boolean delete(Donation donation);

}
