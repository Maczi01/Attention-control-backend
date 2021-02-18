package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.service.NumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class NumbersController {

    private int[] array = {1,2,3,4,5};

    @Autowired
    private NumbersService numbersService;

    @GetMapping()
    public int[] getNumbers(){
        return numbersService.startGame();
    }
    @PostMapping()
    public void giveNumbers(@RequestBody String p){
        System.out.println(p);
        numbersService.checkNumber(p);
    }

}
