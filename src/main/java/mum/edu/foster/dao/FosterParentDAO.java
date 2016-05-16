package mum.edu.foster.dao;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.Person;
import mum.edu.foster.domain.Staff;
import mum.edu.foster.domain.Support;

public interface FosterParentDAO extends JpaRepository<Person, Long> {

	public List<Person> findAll();
	
	public void saveFosterParent(Staff staff);
	public void updateFosterParent(Staff staff);
	public Staff loadFosterParent(long userId);
	public void delete(Staff Staff);
	public boolean checkFosterParent(long userId,String password);
	public void creatFosterParentDAO(long id,String FName,String Lname,String email, String phone, String occupation, List<Support> supports,
		List<Children> children);
}
