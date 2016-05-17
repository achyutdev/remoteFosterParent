package mum.edu.foster.service;

import java.util.List;

import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.domain.Person;
import mum.edu.foster.service.impl.FosterParentServiceImpl;

import org.springframework.stereotype.Service;

@Service
public interface FosterParentService {

	public Long save(FosterParent fosterParent);

	public void delete(FosterParent fosterParent);

	public List<Person> findAll();

	public Person findById(Long id);

	public Person displayDetail(Long id);

}
