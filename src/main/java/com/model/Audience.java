package com.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Audience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int audienceId;
	private String audienceName;
	private double amount;

	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "match_id", referencedColumnName = "matchId")
	private Match match;

	@OneToOne
	@JoinColumn(name = "ticket_id", referencedColumnName = "ticketId")
	private Ticket ticket;
	public Audience()
	{
		
	}
	public Audience(int audienceId, String audienceName, double amount, Match match, Ticket ticket) {
		super();
		this.audienceId = audienceId;
		this.audienceName = audienceName;
		this.amount = amount;
		this.match = match;
		this.ticket = ticket;
	}
	public int getAudienceId() {
		return audienceId;
	}
	public void setAudienceId(int audienceId) {
		this.audienceId = audienceId;
	}
	public String getAudienceName() {
		return audienceName;
	}
	public void setAudienceName(String audienceName) {
		this.audienceName = audienceName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	

}
