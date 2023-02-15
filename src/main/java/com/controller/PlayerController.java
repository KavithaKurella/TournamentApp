package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Player;
import com.service.IPlayerService;


@RestController
@RequestMapping("/player")
public class PlayerController {
	@Autowired
	IPlayerService iPlayerService;
	
	@GetMapping("/getPlayer/{playerId}")
	public Player getPlayer(@PathVariable int playerId) throws Exception{
		return iPlayerService.getPlayer(playerId);
	}

	@GetMapping("/getAllPlayers")
	public List<Player> getAllPlayers() throws Exception{
		return iPlayerService.getAllPlayers();
	}

	@PostMapping("/insertPlayer")
	public Player insertPlayer(@RequestBody Player player) throws Exception{
		return iPlayerService.insertPlayer(player);
	}

	@PutMapping("/updatePlayer")
	public Player updatePlayer(@RequestBody Player player) throws Exception{
		return iPlayerService.updatePlayer(player);
	}

	@DeleteMapping("/deletePlayer/{playerId}")
	public Player deletePlayer(@PathVariable int playerId) throws Exception{
		return iPlayerService.deletePlayer(playerId);
	}

	@GetMapping("/getSalary/{id}")
	public double getSalary(@PathVariable int id) throws Exception{
		return iPlayerService.getSalary(id);
	}


}
