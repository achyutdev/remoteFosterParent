package mum.edu.foster.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.foster.domain.Donation;

@Repository
public interface DonationDAO extends JpaRepository<Donation, Long>{

}
