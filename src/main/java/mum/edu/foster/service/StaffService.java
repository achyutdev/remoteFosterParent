package mum.edu.foster.service;

import java.util.List;

import mum.edu.foster.domain.Person;
import mum.edu.foster.domain.Staff;

public interface StaffService {
	public List<Person> findAll();
	public void saveStaff(Staff staff);
	public void updateStaff(Staff staff);
	public Staff loadStaff(long userId);
	public void delete(Staff Staff);
	public boolean checkStaff(long userId,String password);	
}
