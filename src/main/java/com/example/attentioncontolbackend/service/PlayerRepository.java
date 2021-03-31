package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {


}
