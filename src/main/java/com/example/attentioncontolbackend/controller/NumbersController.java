package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.service.NumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class NumbersController {

    @Autowired
    private NumbersService numbersService;

    @GetMapping()
    public int[] getNumbers() {
        return numbersService.startGame();
    }

    @PostMapping()
    public boolean giveNumbers(@RequestBody String p) {
        boolean b = numbersService.checkNumber(p);
        System.out.println(b);
        return b;
    }

}
