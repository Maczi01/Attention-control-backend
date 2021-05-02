package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.result.ResultTo;
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

    @GetMapping("/{id}")
    public ResultTo getPlayer(@PathVariable Integer id) {
        System.out.println(id);
        return resultService.getPlayerById(id);
    }

    @PostMapping()
    public ResultTo addPlayer(@RequestBody ResultTo resultTo) {
        System.out.println(resultTo);
        return resultService.addNewPlayer(resultTo);
    }

    @DeleteMapping("/{id}")
    public void deleteResult(@PathVariable String id) {
        System.out.println(id);
        resultService.deleteResult(Integer.valueOf(id));
    }

}
