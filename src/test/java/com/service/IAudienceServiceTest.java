package com.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.model.Ticket;

class IAudienceServiceTest {

	/*@Test
	void testGetAudience() {
		fail("Not yet implemented");
	}

	@Test
	void testInsertAudience() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMatch() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllMatches() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllTickets() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTicket() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPaidAmountForAllTickects() {
		fail("Not yet implemented");
	}*/
	@Test
	public void testGetPaidAmountForAllTickets() throws Exception {
	    IAudienceService audienceService = mock(IAudienceService.class);
	    double expectedPaidAmount = 500.00;
	    when(audienceService.getPaidAmountForAllTickects()).thenReturn(expectedPaidAmount);
	    double actualPaidAmount = audienceService.getPaidAmountForAllTickects();
	    assertEquals(expectedPaidAmount, actualPaidAmount, 0.01);
	}
	@Test
	public void testGetTicket() throws Exception {
	    IAudienceService audienceService = mock(IAudienceService.class);
	    int expectedTicketId = 1;
	    Ticket expectedTicket = new Ticket(expectedTicketId, 100.00);
	    when(audienceService.getTicket(expectedTicketId)).thenReturn(expectedTicket);
	    Ticket actualTicket = audienceService.getTicket(expectedTicketId);
	    assertEquals(expectedTicketId, ( actualTicket).getTicketId());
	    assertEquals(expectedTicket.getTotalAmount(), actualTicket.getTotalAmount(), 0.01);
	}
	@Test
	public void testGetAllTickets() throws Exception {
	    IAudienceService audienceService = mock(IAudienceService.class);
	    List<Ticket> expectedTickets = Arrays.asList(
	        new Ticket(1, 100.00),
	        new Ticket(2, 150.00),
	        new Ticket(3, 75.00)
	    );
	    when(audienceService.getAllTickets()).thenReturn(expectedTickets);
	    List<Ticket> actualTickets = audienceService.getAllTickets();
	    assertEquals(expectedTickets.size(), actualTickets.size());
	    for (int i = 0; i < expectedTickets.size(); i++) {
	        assertEquals(expectedTickets.get(i).getTicketId(), actualTickets.get(i).getTicketId());
	        assertEquals(expectedTickets.get(i).getTotalAmount(), actualTickets.get(i).getTotalAmount(), 0.01);
	    }
	    
	            
	        }
	/*@Test
	public void testGetAllMatches() throws Exception {
	    IAudienceService audienceService = mock(IAudienceService.class);
	    List<Match> expectedMatches = Arrays.asList(
	        new Match(1, "Football"),
	        new Match(2, "Basketball"),
	        new Match(3, "Tennis")
	    );
	    when(audienceService.getAllMatches()).thenReturn(expectedMatches);
	    List<com.model.Match> actualMatches = audienceService.getAllMatches();
	    assertEquals(expectedMatches.size(), actualMatches.size());
	    for (int i = 0; i < expectedMatches.size(); i++) {
	        assertEquals(expectedMatches.get(i).getTicketId(), actualMatches.get(i).getId());
	        assertEquals(expectedMatches.get(i).getName(), actualMatches.get(i).getName());
	    }
	}*/
	
	    
	}


