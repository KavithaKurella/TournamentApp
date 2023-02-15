package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.Audience;
import com.model.Match;
import com.model.Ticket;
import com.repository.AudienceRepository;
import com.repository.MatchRepository;
import com.repository.TicketRepository;
@Component
public class IAudienceServiceImpl implements IAudienceService {
	@Autowired
	AudienceRepository audienceRepository;
	
	@Autowired
	MatchRepository matchRepository;
	
	@Autowired
	TicketRepository ticketRepository;

	@Override
	public Audience getAudience(int audienceId) throws Exception {
		Audience bean = null;
		try {
			bean = audienceRepository.findById(audienceId).get();
		}
		catch(Exception e) {
			throw new Exception("Audience details not found!");
		}
		return bean;
	}

	@Override
	public Audience insertAudience(Audience audience) throws Exception {
		audienceRepository.saveAndFlush(audience);
		return audience;
	}

	@Override
	public Match getMatch(int audienceId) throws Exception {
		Audience bean = null;
		try {
			bean = audienceRepository.findById(audienceId).get();
		}
		catch(Exception e) {
			throw new Exception("Audience details not found!");
		}
		return bean.getMatch();
	}

	@Override
	public List<Match> getAllMatches() throws Exception {
		return matchRepository.findAll();
	}

	@Override
	public List<Ticket> getAllTickets() throws Exception {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket getTicket(int ticketId) throws Exception {
		Ticket ticket = null;
		try {
			ticket = ticketRepository.findById(ticketId).get();
		}
		catch(Exception e) {
			throw new Exception("Ticket details not found!");
		}
		return ticket;
	}

	@Override
	public double getPaidAmountForAllTickects() throws Exception {
		double ans = 0;
		try {
			for(Ticket i : ticketRepository.findAll()) {
				ans+=i.getTotalAmount();
			}
		}
		catch(Exception e) {
			throw new Exception("Ticket details not found!");	
		}
		return ans;
	}
	

}
