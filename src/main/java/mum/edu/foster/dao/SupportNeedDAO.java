package mum.edu.foster.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.foster.domain.SupportNeed;

public interface SupportNeedDAO extends JpaRepository<SupportNeed, Long> {

	public List<SupportNeed> findAll();
	
	public List<SupportNeed> findByCategory();
	
}
