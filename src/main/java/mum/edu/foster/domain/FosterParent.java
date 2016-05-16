package mum.edu.foster.domain;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("FosterParent")
public class FosterParent extends Person {

	private String email;
	private String phone;
	private String occupation;
	
	public FosterParent(long id, String firstName, String lastName,String email, String phone, String occupation, List<Support> supports,
			List<Children> children) {
		super(id,  firstName, lastName);
		this.email = email;
		this.phone = phone;
		this.occupation = occupation;
		this.supports = supports;
		this.children = children;
	}

	@OneToMany
	private List<Support> supports;
	
	@ManyToMany
	@JoinTable(name ="Foster_Children",
	joinColumns =@JoinColumn(name="FosterID"),
	inverseJoinColumns =@JoinColumn(name="ChildrenId"))
	private List<Children> children;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public List<Support> getSupports() {
		return supports;
	}

	public void setSupports(List<Support> supports) {
		this.supports = supports;
	}
	
	
	
	
}
