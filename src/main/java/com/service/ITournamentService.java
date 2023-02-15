package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Match;
import com.model.Tournament;


@Service
public interface ITournamentService {
	public Tournament getTournament(int tournamentId) throws Exception;

	public List<Tournament> getAllTournaments() throws Exception;

	public Tournament insertTournament(Tournament tournament) throws Exception;

	public Tournament updateTournament(Tournament tournament) throws Exception;

	public Tournament deleteTournament(int tournamentId) throws Exception;

	public List<Match> getAllMatches() throws Exception;

	public Match getMatch(int tournamentId, int matchId) throws Exception;

	public Tournament getTournament(Match match) throws Exception;

}
