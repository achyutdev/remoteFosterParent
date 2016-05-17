package mum.edu.foster.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Donation {

	@Id @GeneratedValue
	private long id;
	private double amount;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDonatedDate() {
		return date;
	}
	public void setDonatedDate(Date donatedDate) {
		this.date = donatedDate;
	}
	
	

}
