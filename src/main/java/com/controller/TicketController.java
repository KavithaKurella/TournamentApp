package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Audience;
import com.model.Ticket;
import com.service.ITicketService;


@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	ITicketService iTicketService;
	
	@GetMapping("/getTicket/{ticketId}")
	public Ticket getTicket(@PathVariable int ticketId) throws Exception{
		return iTicketService.getTicket(ticketId);
	}
	
	@PostMapping("/insertTicket")
	public Ticket insertTicket(@RequestBody Ticket ticket) throws Exception{
		return iTicketService.insertTicket(ticket);
	}

	@DeleteMapping("/cancelTicket/{ticketId}")
	public Ticket cancelTicket(@PathVariable int ticketId) throws Exception{
		return iTicketService.cancelTicket(ticketId);
	}

	@GetMapping("/getSchedule/{ticketId}")
	public Audience getSchedule(@PathVariable int ticketId) throws Exception{
		return iTicketService.getSchedule(ticketId);
	}

	@GetMapping("/getBill/{id}")
	public double getBill(@PathVariable int id) throws Exception{
		return iTicketService.getBill(id);
	}


}
