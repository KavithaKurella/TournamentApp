package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Audience;
import com.model.Ticket;
import com.repository.TicketRepository;

@Component
public class ITicketServiceImpl implements ITicketService {
	@Autowired
	TicketRepository ticketRepository;

	
	public Ticket getTicket(int ticketId) throws Exception {
		Ticket bean = null;
		try {
			bean = ticketRepository.findById(ticketId).get();
		}
		catch(Exception e) {
			throw new Exception("Ticket details not found!");
		}
		return bean;
	}

	
	public Ticket insertTicket(Ticket ticket) throws Exception {
		ticketRepository.saveAndFlush(ticket);
		return ticket;
	}

	
	public Ticket cancelTicket(int ticketId) throws Exception {
		Ticket bean = null;
		try {
			bean = ticketRepository.findById(ticketId).get();
		}
		catch(Exception e) {
			throw new Exception("Ticket details not found!");
		}
		ticketRepository.deleteById(ticketId);
		return bean;
	}

	
	public Audience getSchedule(int ticketId) throws Exception {
		Ticket bean = null;
		try {
			bean = ticketRepository.findById(ticketId).get();
		}
		catch(Exception e) {
			throw new Exception("Ticket details not found!");
		}
		return bean.getAudience();
	}

	
	public double getBill(int id) throws Exception {
		Ticket bean = null;
		try {
			bean = ticketRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new Exception("Ticket details not found!");
		}
		return bean.getTotalAmount();
	}



}
