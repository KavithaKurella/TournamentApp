package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.Player;
import com.model.Team;
import com.model.Ticket;
import com.repository.PlayerRepository;
import com.repository.TeamRepository;



@Component
public class ITeamServiceImpl implements  ITeamService{
	@Autowired
	TeamRepository teamRepository;
	
	@Autowired
	PlayerRepository playerRepository;

	@Override
	public Team getTeam(int teamId) throws Exception {
		Team bean = null;
		try {
			bean = teamRepository.findById(teamId).get();
		}
		catch(Exception e) {
			throw new Exception("Team details not found!");
		}
		return bean;
	}

	@Override
	public List<Team> getAllTeams() throws Exception {
		return teamRepository.findAll();
	}

	@Override
	public Team insertTeam(Team team) throws Exception {
		teamRepository.saveAndFlush(team);
		return team;
	}

	@Override
	public Team updateTeam(Team team) throws Exception {
		Team bean = null;
		try {
			bean = teamRepository.findById(team.getTeamId()).get();
		}
		catch(Exception e) {
			throw new Exception("Team details not found!");
		}
		teamRepository.saveAndFlush(team);
		return bean;
	}

	@Override
	public Team deleteTeam(int teamId) throws Exception {
		Team bean = null;
		try {
			bean = teamRepository.findById(teamId).get();
		}
		catch(Exception e) {
			throw new Exception("Team details not found!");
		}
		teamRepository.deleteById(teamId);
		return bean;
	}

	@Override
	public List<Player> getAllPlayers() throws Exception {
		return playerRepository.findAll();
	}

	@Override
	public Player getPlayer(int teamId, int playerId) throws Exception {
		Player bean = null;
		try {
			bean = playerRepository.findById(playerId).get();
		}
		catch(Exception e) {
			throw new Exception("Player details not found!");
		}
		return bean;
	}

	@Override
	public Team getTeam(Player player) throws Exception {
		Player bean = null;
		try {
			bean = playerRepository.findById(player.getPlayerId()).get();
		}
		catch(Exception e) {
			throw new Exception("Team details not found!");
		}
		return bean.getTeam();
	}

	

}
