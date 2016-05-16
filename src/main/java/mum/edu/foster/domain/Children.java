package mum.edu.foster.domain;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Childern")
public class Children extends Person {

	public Children(long id, String firstName, String lastName) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public Children(long id, String firstName, String lastName, String description, String educationalStatus,
			List<SupportNeed> supportNeeds, List<Expenditure> expeditures, List<FosterParent> fosterParents) {
		super(id, firstName, lastName);
		this.description = description;
		this.educationalStatus = educationalStatus;
		this.supportNeeds = supportNeeds;
		this.expeditures = expeditures;
		this.fosterParents = fosterParents;
	}

	private String description;
	private String educationalStatus;
	
	@OneToMany
	@JoinColumn(name="supportNeed")
	private List<SupportNeed> supportNeeds;
	
	@OneToMany
	@JoinColumn(name="ExpenditureId")
	private List<Expenditure> expeditures;
	
	@ManyToMany(mappedBy="children")
	private List<FosterParent> fosterParents;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEducationalStatus() {
		return educationalStatus;
	}

	public void setEducationalStatus(String educationalStatus) {
		this.educationalStatus = educationalStatus;
	}

	public List<SupportNeed> getSupportNeeds() {
		return supportNeeds;
	}

	public void setSupportNeeds(List<SupportNeed> supportNeeds) {
		this.supportNeeds = supportNeeds;
	}
	
}
