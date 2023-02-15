package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import com.exception.MatchNotFoundException;
import com.model.Audience;
import com.model.Match;
import com.model.Schedule;
import com.model.Team;
import com.model.Tournament;
import com.repository.AudienceRepository;
import com.repository.MatchRepository;
import com.repository.TeamRepository;

@Component
public  class IMatchServiceImpl implements IMatchService{
	@Autowired
	MatchRepository matchRepository;
	
	@Autowired
	TeamRepository teamRepository;
	
	@Autowired
	AudienceRepository audienceRepository;

	@Override
	public Match getMatch(int matchId) throws MatchNotFoundException {
		Match bean = null;
		try {
			bean = matchRepository.findById((long)matchId).get();
		}
		catch(Exception e) {
			throw new MatchNotFoundException("Match details not found!");
		}
		return bean;
	}

	@Override
	public Match insertMatch(Match match) throws MatchNotFoundException {
		matchRepository.saveAndFlush(match);
		return match;
	}

	@Override
	public Match updateMatch(Match match) throws MatchNotFoundException {
		Match bean = null;
		try {
			bean = matchRepository.findById((long)match.getMatchId()).get();
		}
		catch(Exception e) {
			throw new MatchNotFoundException("Match details not found!");
		}
		matchRepository.saveAndFlush(match);
		return bean;
	}

	@Override
	public List<Team> getTeam() throws MatchNotFoundException {
		return teamRepository.findAll();
	}

	/*@Override
	public Schedule getSchedule(int matchId) throws MatchNotFoundException {
		Match bean = null;
		try {
			bean = matchRepository.findById((long)matchId).get();
		}
		catch(Exception e) {
			throw new MatchNotFoundException("Match details not found!");
		}
		return bean.getSchedule();
	}*/

	@Override
	public Tournament getTournament(int matchId) throws MatchNotFoundException {
		Match bean = null;
		try {
			bean = matchRepository.findById((long)matchId).get();
		}
		catch(Exception e) {
			throw new MatchNotFoundException("Match details not found!");
		}
		return bean.getTournament();
	}

	@Override
	public List<Audience> getAllAudience() throws MatchNotFoundException {
		return audienceRepository.findAll();
	}

	@Override
	public Audience getAudience(int audienceId) throws MatchNotFoundException {
		Audience bean = null;
		try {
			bean = audienceRepository.findById(audienceId).get();
		}
		catch(Exception e) {
			throw new MatchNotFoundException("Audience details not found!");
		}
		return bean;
	}

	@Override
	public Schedule getSchedule(int matchId) throws MatchNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
