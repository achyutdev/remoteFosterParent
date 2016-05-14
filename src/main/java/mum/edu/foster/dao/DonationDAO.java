package mum.edu.foster.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.foster.domain.Donation;

public interface DonationDAO extends JpaRepository<Donation, Long>{

	public List<Donation> findAll();
	public List<Donation> findByDonatedDate();
}
