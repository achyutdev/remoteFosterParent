package mum.edu.foster.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.foster.domain.FosterParent;

@Service
public interface FosterParentService {

	public Long save(FosterParent fosterParent);

	public void delete(FosterParent fosterParent);

	public List<FosterParent> getAll();

	public FosterParent getById(Long id);

}
