package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    private List<Player> players;

    @Autowired
    public PlayerService() {
        this.players = new ArrayList<>();
        players.add(new Player(1L, "Maciej", 11));
        players.add(new Player(2L, "Mick", 12));
        players.add(new Player(3L, "Michal", 90));
    }

    public List<Player> getAllPlayers(){
        return players;
    }

    public void addNewPlayer(Player player){
//        players.add(new Player(1L, name, result));
        System.out.println(player);
    }


}
