package mum.edu.foster.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.foster.domain.SupportNeed;

@Repository
public interface SupportNeedDAO extends JpaRepository<SupportNeed, Long> {

	
	public List<SupportNeed> findByCategory();
	
}
