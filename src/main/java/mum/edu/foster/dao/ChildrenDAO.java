package mum.edu.foster.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.foster.domain.Children;

@Repository
public interface ChildrenDAO extends JpaRepository<Children, Long> {


	public List<Children> findByFirstName(String firstName);
	public List<Children> findByLastName(String lastName);

/*	@Query("SELECT c FROM Children c join c.supportNeed s join c.expenditure e WHERE c.id = ?")
	public Children displayDetail(long id);*/
	
}
