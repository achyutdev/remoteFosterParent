package mum.edu.foster.dao;

import java.util.Date;
import java.util.List;

import mum.edu.foster.domain.Donation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationDAO extends JpaRepository<Donation, Long> {


	public List<Donation> findByAmount(double amount);
}
