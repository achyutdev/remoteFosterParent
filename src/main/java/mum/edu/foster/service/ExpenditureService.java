package mum.edu.foster.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.foster.domain.Expenditure;

@Service
public interface ExpenditureService {

	public List<Expenditure> findAll();

	public long save(Expenditure expenditure);

	public List<Expenditure> findByAmount(double amount);

	public List<Expenditure> findByCategory(String category);

	public void delete(long id);
}
