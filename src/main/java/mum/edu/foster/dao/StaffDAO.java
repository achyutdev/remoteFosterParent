package mum.edu.foster.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.foster.domain.Person;

public interface StaffDAO extends JpaRepository<Person, Long> {

	public List<Person> findAll();

	
}
