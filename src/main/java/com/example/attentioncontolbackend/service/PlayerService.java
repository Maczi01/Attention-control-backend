package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.player.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private List<Player> players;
    private NumbersService numbersService;

    public PlayerService(List<Player> players, NumbersService numbersService) {
        this.players = players;
        this.numbersService = numbersService;
        players.add(new Player(1L, "Maciej", 11));
        players.add(new Player(2L, "Mick", 12));
        players.add(new Player(3L, "Michal", 90));
    }

    public List<Player> getAllPlayers(){
        return players;
    }

    public void addNewPlayer(Player player){
        int numbersServiceResult = numbersService.getResult();
        player.getName();
        players.add(player);
    }


}
