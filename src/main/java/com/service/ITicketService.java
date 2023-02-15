package com.service;

import org.springframework.stereotype.Service;

import com.model.Audience;
import com.model.Ticket;
@Service
public interface ITicketService {
	public Ticket getTicket(int ticketId) throws Exception;
	 
	public Ticket insertTicket(Ticket ticket) throws Exception;

	public Ticket cancelTicket(int ticketId) throws Exception;

	public Audience getSchedule(int ticketId) throws Exception;

	public double getBill(int id) throws Exception;

}
