package mum.edu.foster.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.foster.domain.Support;

public interface SupportDAO extends JpaRepository<Support, Long>{
	
	public List<Support> findAll();
	
	public List<Support> findByCategory();

}
