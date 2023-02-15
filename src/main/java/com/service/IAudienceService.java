package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Audience;
import com.model.Match;
import com.model.Ticket;


@Service
public interface IAudienceService {
	public Audience getAudience(int audienceId) throws Exception;

	public Audience insertAudience(Audience audience) throws Exception;

	public Match getMatch(int audienceId) throws Exception;

	public List<Match> getAllMatches() throws Exception;

	public List<Ticket> getAllTickets() throws Exception;

	public Ticket getTicket(int ticketId) throws Exception;

	public double getPaidAmountForAllTickects() throws Exception;


}
