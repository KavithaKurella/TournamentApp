package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import org.hibernate.annotations.Fetch;
//import org.hibernate.annotations.FetchMode;


@Entity
public class Organiser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int organiserId;
	private String organiserName;
	private String email;
	private long phone;
	private double payment;
	private double budget;

	@OneToMany(mappedBy = "organiser" )
	//@Fetch(value = FetchMode.SUBSELECT)
	private List<Tournament> tournaments;
	public Organiser()
	{
		
	}

	public Organiser(int organiserId, String organiserName, String email, long phone, double payment, double budget,
			List<Tournament> tournaments) {
		super();
		this.organiserId = organiserId;
		this.organiserName = organiserName;
		this.email = email;
		this.phone = phone;
		this.payment = payment;
		this.budget = budget;
		this.tournaments = tournaments;
	}

	public int getOrganiserId() {
		return organiserId;
	}

	public void setOrganiserId(int organiserId) {
		this.organiserId = organiserId;
	}

	public String getOrganiserName() {
		return organiserName;
	}

	public void setOrganiserName(String organiserName) {
		this.organiserName = organiserName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public List<Tournament> getTournaments() {
		return tournaments;
	}

	public void setTournaments(List<Tournament> tournaments) {
		this.tournaments = tournaments;
	}
	


}
