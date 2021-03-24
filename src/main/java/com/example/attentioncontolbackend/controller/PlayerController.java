package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.player.Player;
import com.example.attentioncontolbackend.service.NumbersService;
import com.example.attentioncontolbackend.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private PlayerService playerService;
    private NumbersService numbersService;

    public PlayerController(PlayerService playerService, NumbersService numbersService) {
        this.playerService = playerService;
        this.numbersService = numbersService;
    }

    @GetMapping()
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping()
    public void addPlayer(Player player) {
        int result = numbersService.getResult();
        String name = player.getName();
        playerService.addNewPlayer(new Player(1L, name, result));
    }


}
