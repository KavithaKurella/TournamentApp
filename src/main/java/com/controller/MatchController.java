package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.MatchNotFoundException;
import com.model.Audience;
import com.model.Match;
import com.model.Schedule;
import com.model.Team;
import com.model.Tournament;
import com.service.IMatchService;


@RestController
@RequestMapping("/match")
public class MatchController {
	@Autowired
	IMatchService iMatchService;
	
	@GetMapping("/getMatch/{matchId}")
	public Match getMatch(@PathVariable int matchId) throws MatchNotFoundException{
		return iMatchService.getMatch(matchId);
	}

	@PostMapping("/insertMatch")
	public Match insertMatch(@RequestBody Match match) throws MatchNotFoundException{
		return iMatchService.insertMatch(match);
	}

	@PutMapping("/updateMatch")
	public Match updateMatch(@RequestBody Match match) throws MatchNotFoundException{
		return iMatchService.updateMatch(match);
	}

	@GetMapping("/getTeam")
	public List<Team> getTeam() throws MatchNotFoundException{
		return iMatchService.getTeam();
	}

	@GetMapping("/getSchedule/{matchId}")
	public Schedule getSchedule(@PathVariable int matchId) throws MatchNotFoundException{
		return iMatchService.getSchedule(matchId);
	}

	@GetMapping("/getTournament/{matchId}")
	public Tournament getTournament(@PathVariable int matchId) throws MatchNotFoundException{
		return iMatchService.getTournament(matchId);
	}
	
	@GetMapping("/getAllAudience")
	public List<Audience> getAllAudience() throws MatchNotFoundException{
		return iMatchService.getAllAudience();
	}
	
	@GetMapping("/getAudience/{audienceId}")
	public Audience getAudience(@PathVariable int audienceId) throws MatchNotFoundException{
		return iMatchService.getAudience(audienceId);
	}


}
