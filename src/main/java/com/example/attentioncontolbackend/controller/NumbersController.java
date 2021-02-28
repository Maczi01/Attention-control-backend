package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.logic.GameTo;
import com.example.attentioncontolbackend.logic.NumberTo;
import com.example.attentioncontolbackend.service.NumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
public class NumbersController {

//
//    Apka musi
//    wysylac do
//    frontu obiekt "gra"
//    z punktacją
//    zero,
//
//    boardem(wygenerowanym),i co najwazniejsze CZASEM!!zakonczenia!

    @Autowired
    private NumbersService numbersService;

    @GetMapping()
    public int[] getNumbers() throws InterruptedException {
        return numbersService.startGame();
    }

    @GetMapping("/time")
    public GameTo object()  {
        return numbersService.initGame();
    }

    @PostMapping()
    public boolean giveNumbers(@RequestBody String p) {
        boolean b = numbersService.checkNumber(p);
        System.out.println(b);
        return b;
    }
    @PostMapping("/api")
    public boolean giveNextNumber(@RequestBody NumberTo numberTo) {
        boolean b = numbersService.checkGivenNumber(numberTo);
        System.out.println(b);
        return b;
    }

    @GetMapping("/results")
    public int getResult()  {
        return numbersService.getResult();
    }

}
