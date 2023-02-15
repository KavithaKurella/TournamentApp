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

import com.model.Organiser;
import com.model.Tournament;
import com.service.IOrganiserService;


@RestController
@RequestMapping("/organiser")
public class OrganiserController {
	@Autowired
	IOrganiserService iOrganiserService;

	@GetMapping("/getOrganiser/{organiserId}")
	public Organiser getOrganiser(@PathVariable int organiserId) throws Exception{
		return iOrganiserService.getOrganiser(organiserId);
	}

	@GetMapping("/getAllOrganisers")
	public List<Organiser> getAllOrganisers() throws Exception{
		return iOrganiserService.getAllOrganisers();
	}

	@PostMapping("/insertOrganiser")
	public Organiser insertOrganiser(@RequestBody Organiser organiser) throws Exception{
		return iOrganiserService.insertOrganiser(organiser);
	}

	@PutMapping("/updateOrganiser")
	public Organiser updateOrganiser(@RequestBody Organiser organiser) throws Exception{
		return iOrganiserService.updateOrganiser(organiser);
	}

	@GetMapping("/getTournaments")
	public List<Tournament> getTournaments() throws Exception{
		return iOrganiserService.getTournaments();
	}

	@GetMapping("/getTournament/{tournamentId}")
	public Tournament getTournament(@PathVariable int tournamentId) throws Exception{
		return iOrganiserService.getTournament(tournamentId);
	}

	@GetMapping("/getTournament/{id}")
	public double getBudget(@PathVariable int id) throws Exception{
		return iOrganiserService.getBudget(id);
	}


}
