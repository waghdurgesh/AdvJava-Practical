package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourseNotFoundException;
import com.app.entities.Player;
import com.app.repositories.PlayerRepository;

@Service
@Transactional
public class PlayerServiceImpl implements IPlayerService {
	// dependncy injection
	@Autowired
	private PlayerRepository playerRepo;

	@Override
	public List<Player> getAllPlayers() {
		return playerRepo.findAll();
	}

	@Override
	public Player insertPlayer(Player player) {
		return playerRepo.save(player);
	}

	@Override
	public String deletePlayer(Long pid) {
		System.out.println("id= " + pid);
		if (playerRepo.existsById(pid)) {
			playerRepo.deleteById(pid);
			return "Delete Succesfully!";
		}
		throw new ResourseNotFoundException("ID Invalid");

	}

	@Override
	public Player editPlayer(Player ply) {
		if (playerRepo.existsById(ply.getId())) {
			return playerRepo.save(ply);
		}
		throw new ResourseNotFoundException("Invalid ID!");
	}

}
