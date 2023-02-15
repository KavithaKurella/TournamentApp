package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
public class Ground {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int groundId;
	private String groungName;
	private int capacity;

	@OneToMany(mappedBy = "ground")
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Match> matches;

	@OneToOne
	@JoinColumn(name = "address_id", referencedColumnName = "addressId")
	private Address address;
	public Ground()
	{
		
	}
	public Ground(int groundId, String groungName, int capacity, List<Match> matches, Address address) {
		super();
		this.groundId = groundId;
		this.groungName = groungName;
		this.capacity = capacity;
		this.matches = matches;
		this.address = address;
	}
	public int getGroundId() {
		return groundId;
	}
	public void setGroundId(int groundId) {
		this.groundId = groundId;
	}
	public String getGroungName() {
		return groungName;
	}
	public void setGroungName(String groungName) {
		this.groungName = groungName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<Match> getMatches() {
		return matches;
	}
	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
