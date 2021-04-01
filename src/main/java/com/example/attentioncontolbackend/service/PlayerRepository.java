package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.player.PlayerTo;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository  {

    void save(PlayerTo playerTo);
}
