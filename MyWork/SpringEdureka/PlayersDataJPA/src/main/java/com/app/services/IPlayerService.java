package com.app.services;

import java.util.List;

import com.app.entities.Player;

public interface IPlayerService {
	// get
	List<Player> getAllPlayers();

	// insert
	Player insertPlayer(Player player);

	// delete
	String deletePlayer(Long id);

	// edit
	Player editPlayer(Player player);
}
