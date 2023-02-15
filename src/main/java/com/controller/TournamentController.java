package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Match;
import com.model.Tournament;
import com.service.ITournamentService;

@RestController
@RequestMapping("/tournament")
public class TournamentController {
	@Autowired
	ITournamentService iTournamentService;
	
	@GetMapping("/getTournament/{tournamentId}")
	public Tournament getTournament(@PathVariable int tournamentId) throws Exception{
		return iTournamentService.getTournament(tournamentId);
	}
	
	@GetMapping("/getAllTournaments")
	public List<Tournament> getAllTournaments() throws Exception{
		return iTournamentService.getAllTournaments();
	}

	@PostMapping("/insertTournament")
	public Tournament insertTournament(@RequestBody Tournament tournament) throws Exception{
		return iTournamentService.insertTournament(tournament);
	}

	@PutMapping("/updateTournament")
	public Tournament updateTournament(@RequestBody Tournament tournament) throws Exception{
		return iTournamentService.updateTournament(tournament);
	}
	@DeleteMapping("/deleteTournament/{tournamentId}")
	public Tournament deleteTournament(@PathVariable int tournamentId) throws Exception{
		return iTournamentService.deleteTournament(tournamentId);
	}

	@DeleteMapping("/getAllMatches")
	public List<Match> getAllMatches() throws Exception{
		return iTournamentService.getAllMatches();
	}
	
	@GetMapping("/getMatch/{tournamentId}/{matchId}")
	public Match getMatch(@PathVariable int tournamentId,@PathVariable int matchId) throws Exception{
		return iTournamentService.getMatch(tournamentId, matchId);
	}

	@GetMapping("/getTournament")
	public Tournament getTournament(@RequestBody Match match) throws Exception{
		return iTournamentService.getTournament(match);
	}

}
