package mum.edu.foster.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.domain.Person;

@Service
public interface FosterParentService {

	public Long save(FosterParent fosterParent);

	public void delete(FosterParent fosterParent);

	List<FosterParent> findAll();

	Person findById(Long id);

	Person displayDetail(Long id);

}
