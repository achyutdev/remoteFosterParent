package mum.edu.foster.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.foster.domain.Expenditure;

@Repository
public interface ExpenditureDAO extends JpaRepository<Expenditure, Long> {

	//public List<Expenditure> findAll();

	public List<Expenditure> findByCategory();
}
