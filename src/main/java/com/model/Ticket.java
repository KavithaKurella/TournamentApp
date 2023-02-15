package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int ticketId;
	private String ticketName;
	private double totalAmount;
	private int noOfSeats;

	@OneToOne
	@JoinColumn(name = "match_id", referencedColumnName = "matchId")
	private Match match;

	@OneToOne
	@JoinColumn(name = "audience_id", referencedColumnName = "audienceId")
	private Audience audience;
	public Ticket()
	{
		
	}
	public Ticket(int ticketId, double totalAmount) {
		super();
		this.ticketId = ticketId;
		this.ticketName = ticketName;
		this.totalAmount = totalAmount;
		this.noOfSeats = noOfSeats;
		this.match = match;
		this.audience = audience;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getTicketName() {
		return ticketName;
	}
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	public Audience getAudience() {
		return audience;
	}
	public void setAudience(Audience audience) {
		this.audience = audience;
	}
	

}
