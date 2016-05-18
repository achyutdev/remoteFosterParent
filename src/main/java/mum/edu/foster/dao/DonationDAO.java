package mum.edu.foster.dao;

import java.util.List;

import mum.edu.foster.domain.Donation;
import mum.edu.foster.domain.FosterParent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationDAO extends JpaRepository<Donation, Long>{
	
	public List<Donation> findByAmount(double amount);
	
	@Query("Select Distinct f from FosterParent f join f.supports s join s.donation d")
	public List<FosterParent> findDetailAll();
}
