package mum.edu.foster.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.foster.domain.Donation;

@Service
public interface DonationService {

	public List<Donation> findAll();

	public List<Donation> findByAmount(double amount);


	public void delete(long id);

	public long save(Donation donation);

}
