package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.exception.MatchNotFoundException;
import com.model.Match;
import com.model.Tournament;
import com.repository.MatchRepository;
import com.repository.TournamentRepository;


@Component
public class ITournamentServiceImpl implements ITournamentService{
	@Autowired
	TournamentRepository tournamentRepository;
	
	@Autowired
	MatchRepository matchRepository;

	@Override
	public Tournament getTournament(int tournamentId) throws Exception {
		Tournament bean = null;
		try {
			bean = tournamentRepository.findById(tournamentId).get();
		}
		catch(Exception e) {
			throw new Exception("Tournament details not found!");
		}
		return bean;
	}

	@Override
	public List<Tournament> getAllTournaments() throws Exception {
		return tournamentRepository.findAll();
	}

	@Override
	public Tournament insertTournament(Tournament tournament) throws Exception {
		tournamentRepository.saveAndFlush(tournament);
		return tournament;
	}

	@Override
	public Tournament updateTournament(Tournament tournament) throws Exception {
		Tournament bean = null;
		try {
			bean = tournamentRepository.findById(tournament.getTournamentId()).get();
		}
		catch(Exception e) {
			throw new Exception("Tournament details not found!");
		}
		tournamentRepository.saveAndFlush(tournament);
		return bean;
	}

	@Override
	public Tournament deleteTournament(int tournamentId) throws Exception {
		Tournament bean = null;
		try {
			bean = tournamentRepository.findById(tournamentId).get();
		}
		catch(Exception e) {
			throw new Exception("Tournament details not found!");
		}
		tournamentRepository.deleteById(tournamentId);
		return bean;
	}

	@Override
	public List<Match> getAllMatches() throws Exception {
		return matchRepository.findAll();
	}

	@Override
	public Match getMatch(int tournamentId, int matchId) throws Exception {
		Tournament bean = null;
		try {
			bean = tournamentRepository.findById(tournamentId).get();
		}
		catch(Exception e) {
			throw new Exception("Tournament details not found!");
		}
		return bean.getMatch();
	}

	@Override
	public Tournament getTournament(Match match) throws Exception {
		Match bean = null;
		try {
			bean = matchRepository.findById((long)match.getMatchId()).get();
		}
		catch(Exception e) {
			throw new MatchNotFoundException("Match details not found!");
		}
		return bean.getTournament();
	}


}
