package mum.edu.foster.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import mum.edu.foster.dao.FosterParentDAO;
import mum.edu.foster.domain.Children;
import mum.edu.foster.domain.FosterParent;
import mum.edu.foster.domain.Person;
import mum.edu.foster.domain.Staff;
import mum.edu.foster.domain.Support;

public class FosterParentDAOImpl implements FosterParentDAO {
	@PersistenceContext
	protected EntityManager em;
	 
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<Person> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Person> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Person> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person getOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Person> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Person> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Person> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Person arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Person> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Person> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Person> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Person> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Person> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Person> S findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveFosterParent(Staff staff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFosterParent(Staff staff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Staff loadFosterParent(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Staff Staff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkFosterParent(long userId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	
	public void creatFosterParentDAO(long id, String FName, String Lname, String email, String phone, String occupation,
			List<Support> supports, List<Children> children) {
		
		Person person =new FosterParent( id,FName,Lname,email, phone,occupation,
				 supports,children);
		em.persist(person);
	}

}
