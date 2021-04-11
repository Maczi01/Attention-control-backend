package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.player.ResultTo;
import com.example.attentioncontolbackend.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ResultController {

    private ResultService resultService;

    @Autowired
    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping()
    public List<ResultTo> getAllPlayers() {
        return resultService.getAllResults();
    }

    @PostMapping()
    public ResultTo addPlayer(@RequestBody ResultTo resultTo) {
        return resultService.addNewPlayer(resultTo);
//        System.out.println( + " " + result);
    }

    @DeleteMapping("/{id}")
    public void deleteResult(@PathVariable Long id){
        System.out.println(id);
        resultService.deleteResult(id);
    }

}