package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Audience;
import com.model.Match;
import com.model.Ticket;
import com.service.IAudienceService;


@RestController
@RequestMapping("/audience")
public class AudienceController {
	@Autowired
	IAudienceService iaudienceservice;
	
	@GetMapping("/getAudience/{audienceId}")
	public Audience getAudience(@PathVariable int audienceId) throws Exception{
		return iaudienceservice.getAudience(audienceId);
	}

	@PostMapping("/insertAudience")
	public Audience insertAudience(@RequestBody Audience audience) throws Exception{
		return iaudienceservice.insertAudience(audience);
	}

	@GetMapping("/getMatch/{audienceId}")
	public Match getMatch(@PathVariable int audienceId) throws Exception{
		return iaudienceservice.getMatch(audienceId);
	}
	@GetMapping("/getAllMatches")
	public List<Match> getAllMatches() throws Exception{
		return iaudienceservice.getAllMatches();
	}

	@GetMapping("/getAllTickets")
	public List<Ticket> getAllTickets() throws Exception{
		return iaudienceservice.getAllTickets();
	}
	@GetMapping("/getTicket/{ticketId}")
	public Ticket getTicket(@PathVariable int ticketId) throws Exception{
		return iaudienceservice.getTicket(ticketId);
	}

	@GetMapping("/getPaidAmountForAllTickects")
	public double getPaidAmountForAllTickects() throws Exception{
		return iaudienceservice.getPaidAmountForAllTickects();
	}

}
