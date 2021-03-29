package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.player.Player;
import com.example.attentioncontolbackend.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PlayerController {

    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping()
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping()
    public void addPlayer(String name, int result) {
        playerService.addNewPlayer(name, result);
        System.out.println("Players:" + playerService.getAllPlayers());
    }


}
