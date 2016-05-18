package mum.edu.foster.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.foster.domain.Support;

@Repository
public interface SupportDAO extends JpaRepository<Support, Long>{
	
	
//	public List<Support> findByCategory();

}
