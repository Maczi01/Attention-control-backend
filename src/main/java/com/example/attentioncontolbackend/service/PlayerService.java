package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.player.Mapper;
import com.example.attentioncontolbackend.player.Player;
import com.example.attentioncontolbackend.player.PlayerTo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    private List<PlayerTo> players;
    private Mapper mapper;
    private PlayerRepository playerRepository;

    public PlayerService(Mapper mapper, PlayerRepository playerRepository) {
        players = new ArrayList<>();
        players.add(new PlayerTo(1L, "Maciej", 11));
        players.add(new PlayerTo(2L, "Mick", 12));
        players.add(new PlayerTo(3L, "Michal", 90));
        this.mapper = mapper;
        this.playerRepository = playerRepository;
    }


    public List<PlayerTo> getAllPlayers() {
        return players;
    }

    public PlayerTo addNewPlayer(PlayerTo playerTo) {
        Player playerEntity = mapper.map2Entity(playerTo);
        Player savedPlayer = playerRepository.save(playerEntity);
        PlayerTo playerTo1 = mapper.map2To(savedPlayer);
        players.add(playerTo1);
        return playerTo1;
    }


}
