package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Player;


@Service
public interface IPlayerService {
	public Player getPlayer(int playerId) throws Exception;

	public List<Player> getAllPlayers() throws Exception;

	public Player insertPlayer(Player player) throws Exception;

	public Player updatePlayer(Player player) throws Exception;

	public Player deletePlayer(int playerId) throws Exception;

	public double getSalary(int id) throws Exception;

}
