package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.player.PlayerTo;
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
    public List<PlayerTo> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping()
    public PlayerTo addPlayer(@RequestBody PlayerTo playerTo) {
        return playerService.addNewPlayer(playerTo);
//        System.out.println( + " " + result);
    }


}
