package mum.edu.foster.service;

import java.util.List;

import mum.edu.foster.domain.SupportNeed;

public interface SupportNeedService {

	public void delete(SupportNeed supportNeed);

	public List<SupportNeed> getAll();

	public SupportNeed getById(Long id);

	public List<SupportNeed> findByCategory();
	
	public Long save(SupportNeed supportNeed);


}
