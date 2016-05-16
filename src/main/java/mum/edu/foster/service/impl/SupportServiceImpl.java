package mum.edu.foster.service.impl;

import java.util.List;

import mum.edu.foster.dao.SupportDAO;
import mum.edu.foster.domain.Person;
import mum.edu.foster.domain.Staff;
import mum.edu.foster.domain.Support;
import mum.edu.foster.service.SupportService;

public class SupportServiceImpl  implements SupportService{
private SupportDAO supportDAO;

@Override
public List<Person> findAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void saveSupport(Support support) {
	// TODO Auto-generated method stub
	
}

@Override
public void updateSupport(Support support) {
	// TODO Auto-generated method stub
	
}

@Override
public Support loadSupport(long userId) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void delete(Support support) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean checkSupport(long userId, String password) {
	// TODO Auto-generated method stub
	return false;
}
	
}
