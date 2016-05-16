package mum.edu.foster.domain;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Staff")
public class Staff extends Person {
	
	public Staff(long id, String firstName, String lastName, Address address, byte[] image, Date dob) {
		super(id, firstName, lastName, address, image, dob);
		// TODO Auto-generated constructor stub
	}
	private String position;
	private double salary;
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
