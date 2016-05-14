package mum.edu.foster.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Support {
		
		@Id @GeneratedValue
		private long id;
		@Enumerated
		private Category category;
		@OneToOne
		private Donation donation;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		public Donation getDonation() {
			return donation;
		}
		public void setDonation(Donation donation) {
			this.donation = donation;
		}
		
		
}
