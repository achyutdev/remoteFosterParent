package mum.edu.foster.domain;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Childern")
public class Children extends Person {

	private String description;
	private String educationalStatus;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="supportNeed")
	private List<SupportNeed> supportNeeds;
	
	@OneToMany(fetch=FetchType.EAGER)
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
