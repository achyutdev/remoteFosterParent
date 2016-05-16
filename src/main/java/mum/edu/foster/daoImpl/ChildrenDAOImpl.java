package mum.edu.foster.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import mum.edu.foster.dao.ChildrenDAO;
import mum.edu.foster.domain.Person;

public class ChildrenDAOImpl implements ChildrenDAO{
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
public List<Person> findByDob() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Person findById(long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Person> findByFirstName(String firstName) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Person> findByLastName(String lastName) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean delete(long id) {
	// TODO Auto-generated method stub
	return false;
}
