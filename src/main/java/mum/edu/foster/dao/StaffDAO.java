package mum.edu.foster.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import mum.edu.foster.domain.Person;
import mum.edu.foster.domain.Staff;

public interface StaffDAO extends JpaRepository<Person, Long> {

	public List<Person> findAll();
	public void saveStaff(Staff staff);
	public void updateStaff(Staff staff);
	public Staff loadStaff(long userId);
	public void delete(Staff Staff);
	public boolean checkStaff(long userId,String password);	
//	public Collection<UserAccount> getUser();
}
	

