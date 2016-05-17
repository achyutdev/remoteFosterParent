package mum.edu.foster.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.foster.domain.Children;

@Service
public interface ChildrenService {

	public List<Children> findAll();

	public Children findById(Long id);

	public List<Children> findByFistName(String firstName);

	public List<Children> findByLastName(String lastName);

	/* public List<Person> findByEducationslStatus(String educationalStatus); */

	public List<Children> findByDateofBirth(Date dob);

	public void delete(long id);

//	public Children displayDetail(long id);

	public long save(Children children);

}
