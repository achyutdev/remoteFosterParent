package mum.edu.foster.service;

import java.util.List;

import mum.edu.foster.domain.Person;

import mum.edu.foster.domain.Support;

public interface SupportService {
	public List<Person> findAll();
	public void saveSupport(Support support);
	public void updateSupport(Support support);
	public Support loadSupport(long userId);
	public void delete(Support support);
	public boolean checkSupport(long userId,String password);	
}
