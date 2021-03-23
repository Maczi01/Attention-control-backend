package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.player.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerService {

    private List<Player> players;

    public PlayerService(List<Player> players) {
        this.players = new ArrayList<>();
        players.add(new Player(1L, "Maciej", 11));
        players.add(new Player(2L, "Mick", 12));
        players.add(new Player(3L, "Michal", 90));
    }

    public List<Player> getAllPlayers(){
        return players;
    }
}
