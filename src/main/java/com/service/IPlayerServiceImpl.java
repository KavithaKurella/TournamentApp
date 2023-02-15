package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.Player;
import com.repository.PlayerRepository;


@Component
public class IPlayerServiceImpl implements IPlayerService{
	@Autowired
	PlayerRepository playerRepository;

	@Override
	public Player getPlayer(int playerId) throws Exception {
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
	public List<Player> getAllPlayers() throws Exception {
		return playerRepository.findAll();
	}

	@Override
	public Player insertPlayer(Player player) throws Exception {
		playerRepository.saveAndFlush(player);
		return player;
	}

	@Override
	public Player updatePlayer(Player player) throws Exception {
		Player bean = null;
		try {
			bean = playerRepository.findById(player.getPlayerId()).get();
		}
		catch(Exception e) {
			throw new Exception("Player details not found!");
		}
		playerRepository.saveAndFlush(player);
		return bean;
	}

	@Override
	public Player deletePlayer(int playerId) throws Exception {
		Player bean = null;
		try {
			bean = playerRepository.findById(playerId).get();
		}
		catch(Exception e) {
			throw new Exception("Player details not found!");
		}
		playerRepository.deleteById(playerId);
		return bean;
	}

	@Override
	public double getSalary(int id) throws Exception {
		double ans = 0;
		Player bean = null;
		try {
			bean = playerRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new Exception("Salary details not found!");
		}
		return bean.getSalary();
	}


}
