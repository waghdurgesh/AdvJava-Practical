package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Player;
import com.app.services.PlayerServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/players")
public class PlayerController {

	@Autowired
	private PlayerServiceImpl playerService;

	@GetMapping("/view")
	public List<Player> getAllPlayerDetails() {
		return playerService.getAllPlayers();
	}

	@PostMapping("/insert")
	public Player addPlayerDetails(@RequestBody Player player) {
		return playerService.insertPlayer(player);
	}

	@DeleteMapping("/delete")
	public void removePlayerDetails(@RequestParam Long id) {
		playerService.deletePlayer(id);
	}

	@PutMapping("/update")
	public Player updatePlayerDetails(@RequestBody Player ply) {
		return playerService.editPlayer(ply);

	}

}
