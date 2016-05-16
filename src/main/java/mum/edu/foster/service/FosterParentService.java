package mum.edu.foster.service;

import java.util.List;

import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.domain.Support;

public interface FosterParentService {
public void creatFosterPrent(long id,String FName,String Lname,String email, String phone, String occupation, List<Support> supports,
		List<Children> children);
	public Long save(FosterParent fosterParent);

	public void delete(FosterParent fosterParent);

	public List<FosterParent> getAll();

	public FosterParent getById(Long id);

}
