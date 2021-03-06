package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.logic.GameTo;
import com.example.attentioncontolbackend.service.NumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
public class NumbersController {

    private NumbersService numbersService;





    @Autowired
    public NumbersController(NumbersService numbersService) {
        this.numbersService = numbersService;
    }

    @GetMapping()
    public int[] getGameBoard()  {
        return numbersService.getGameBoard();
    }

    @GetMapping("/time")
    public GameTo getGameDataAndInitGame()  {
        return numbersService.initGame();
    }

    @PostMapping()
    public boolean giveNumbers(@RequestBody String p) {
        boolean b = numbersService.checkNumber(p);
        System.out.println(b);
        return b;
    }

    @GetMapping("/score")
    public int getScore(){
        return numbersService.getResult();
    }



}
