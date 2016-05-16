package mum.edu.foster.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.foster.domain.Person;

@Repository
public interface StaffDAO extends JpaRepository<Person, Long> {


	
}
