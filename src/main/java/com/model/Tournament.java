package com.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Tournament {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int tournamentId;
	private String tournamentName;

	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "organiser_id", referencedColumnName = "organiserId")
	private Organiser organiser;

	@OneToOne
	@JoinColumn(name = "match_id", referencedColumnName = "matchId")
	private Match match;
	public Tournament()
	{
		
	}
	public Tournament(int tournamentId, String tournamentName, Organiser organiser, Match match) {
		super();
		this.tournamentId = tournamentId;
		this.tournamentName = tournamentName;
		this.organiser = organiser;
		this.match = match;
	}
	public int getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public Organiser getOrganiser() {
		return organiser;
	}
	public void setOrganiser(Organiser organiser) {
		this.organiser = organiser;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	



}
