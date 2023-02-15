package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

//import org.hibernate.annotations.Fetch;
//import org.hibernate.annotations.FetchMode;


@Entity
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public int matchId;

	@OneToOne
	@JoinColumn(name = "team_id", referencedColumnName = "teamId")
	private Team team;

	@OneToOne
	@JoinColumn(name = "tournament_id", referencedColumnName = "tournamentId")	
	private Tournament tournament;

	//@OneToOne
	//@JoinColumn(name = "schedule_id", referencedColumnName = "scheduleId")	
	//private Schedule schedule;

	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "ground_id", referencedColumnName = "groundId")
	private Ground ground;

	@OneToMany(mappedBy = "match" )
	//@Fetch(value = FetchMode.SUBSELECT)
	private List<Audience> audiences;
	public Match()
	{
		
	}
	public Match(int matchId, Team team, Tournament tournament, Schedule schedule, Ground ground,
			List<Audience> audiences) {
		super();
		this.matchId = matchId;
		this.team = team;
		this.tournament = tournament;
		//this.schedule = schedule;
		this.ground = ground;
		this.audiences = audiences;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Tournament getTournament() {
		return tournament;
	}
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
	/*public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}*/
	public Ground getGround() {
		return ground;
	}
	public void setGround(Ground ground) {
		this.ground = ground;
	}
	public List<Audience> getAudiences() {
		return audiences;
	}
	public void setAudiences(List<Audience> audiences) {
		this.audiences = audiences;
	}
	
	
	


}
