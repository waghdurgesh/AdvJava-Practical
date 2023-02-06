package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
