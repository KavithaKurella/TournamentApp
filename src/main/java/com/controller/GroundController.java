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

import com.model.Ground;
import com.model.Match;
import com.service.IGroundService;


@RestController
@RequestMapping("/ground")
public class GroundController {
	@Autowired
	IGroundService iGroundService;
	

	@GetMapping("/getAllmatchesGround/{groungId}")
	public List<Match> getAllmatchesGround(@PathVariable int groungId) throws Exception{
		return iGroundService.getAllMatches();
	}

	@GetMapping("/getmatche/{groungId}/{matchId}")
	public Match getmatche(@PathVariable int groungId,@PathVariable  int matchId) throws Exception{
		return iGroundService.getmatche(groungId, matchId);
	}

	@PostMapping("/insertGround")
	public Ground insertGround(@RequestBody Ground ground) throws Exception{
		return iGroundService.insertGround(ground);
	}

	@PutMapping("/updateGround")
	public Ground updateGround(@RequestBody Ground ground) throws Exception{
		return iGroundService.updateGround(ground);
	}

	@DeleteMapping("/deleteGround/{groungId}")
	public Ground deleteGround(@PathVariable int groungId) throws Exception{
		return iGroundService.deleteGround(groungId);
	}

	@GetMapping("/getAllMatches")
	public List<Match> getAllMatches() throws Exception{
		return iGroundService.getAllMatches();
	}

	@GetMapping("/getMatch/{matchId}")
	public Match getMatch(@PathVariable int matchId) throws Exception{
		return iGroundService.getMatch(matchId);
	}


}
