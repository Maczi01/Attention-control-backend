package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.player.PlayerMapper;
import com.example.attentioncontolbackend.player.PlayerTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService implements PlayerRepository {

    private List<PlayerTo> players;
    private PlayerMapper playerMapper;

    @Autowired
    public PlayerService(PlayerMapper playerMapper) {
        players = new ArrayList<>();
//        players.add(new PlayerTo(1L, "Maciej", 11));
//        players.add(new PlayerTo(2L, "Mick", 12));
//        players.add(new PlayerTo(3L, "Michal", 90));
        this.playerMapper = playerMapper;
    }

    public List<PlayerTo> getAllPlayers() {
        return players;
    }

    public PlayerTo addNewPlayer(PlayerTo playerTo) {
//        Player playerEntity = playerMapper.map2Entity(playerTo);
        save(playerTo);
//        PlayerTo playerTo1 = playerMapper.map2To(savedPlayer);
        System.out.println(playerTo);
        return playerTo;
    }

    @Override
    public void save(PlayerTo playerTo) {
        players.add(playerTo);
    }
}
