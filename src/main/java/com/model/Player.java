package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int playerId;
	private String playerName;
	private double salary;
	//private Skill skill;

	@OneToOne
	@JoinColumn(name = "team_id", referencedColumnName = "teamId")
	private Team team;
	 public Player()
	 {
		 
	 }
	public Player(int playerId, String playerName, double salary, Team team) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.salary = salary;
		this.team = team;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	


}
