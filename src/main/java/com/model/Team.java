package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int teamId;
	private String teamName;
	
	@OneToMany(mappedBy = "team")
	//@Fetch(value = FetchMode.SUBSELECT)
	private List<Player> players;
	
	@OneToMany(mappedBy = "team" )
	//@Fetch(value = FetchMode.SUBSELECT)
	private List<Match> matches;

	public Team() {
	}

	public Team(int teamId, String teamName, List<Player> players, List<Match> matches) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.players = players;
		this.matches = matches;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
	
	}


