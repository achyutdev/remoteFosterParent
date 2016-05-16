package mum.edu.foster.service.impl;

import java.util.List;

import mum.edu.foster.dao.StaffDAO;
import mum.edu.foster.domain.Person;
import mum.edu.foster.domain.Staff;
import mum.edu.foster.service.StaffService;

public class StaffServiceImpl implements StaffService{
private StaffDAO staffDAO;
	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveStaff(Staff staff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Staff loadStaff(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Staff Staff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkStaff(long userId, String password) {

		return staffDAO.checkStaff(userId, password);
		
	}

}
