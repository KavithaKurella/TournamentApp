package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exception.MatchNotFoundException;
import com.model.Audience;
import com.model.Match;
import com.model.Schedule;
import com.model.Team;
import com.model.Tournament;


@Service
public interface IMatchService {
	public Match getMatch(int matchId) throws MatchNotFoundException;

	public Match insertMatch(Match match) throws MatchNotFoundException;

	public Match updateMatch(Match match) throws MatchNotFoundException;

	public List<Team> getTeam() throws MatchNotFoundException;

	public Schedule getSchedule(int matchId) throws MatchNotFoundException;

	public Tournament getTournament(int matchId) throws MatchNotFoundException;
	
	public List<Audience> getAllAudience() throws MatchNotFoundException;
	
	public Audience getAudience(int audienceId) throws MatchNotFoundException;


}
