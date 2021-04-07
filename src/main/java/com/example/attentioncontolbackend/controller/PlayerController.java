package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.player.ResultTo;
import com.example.attentioncontolbackend.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PlayerController {

    private ResultService resultService;

    @Autowired
    public PlayerController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping()
    public List<ResultTo> getAllPlayers() {
        return resultService.getAllPlayers();
    }

    @PostMapping()
    public ResultTo addPlayer(@RequestBody ResultTo resultTo) {
        return resultService.addNewPlayer(resultTo);
//        System.out.println( + " " + result);
    }


}
