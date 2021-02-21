package com.example.attentioncontolbackend.controller;

import com.example.attentioncontolbackend.service.NumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
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
        timer();
        return numbersService.startGame();
    }

    @GetMapping("/time")
    public boolean timer() throws InterruptedException {
        System.out.println("Method started");
        for (int seconds = 5; seconds >= 0; seconds--) {
            System.out.println(seconds);
            Thread.sleep(1000);
        }
        return true;
    }

    @PostMapping()
    public boolean giveNumbers(@RequestBody String p) {
        boolean b = numbersService.checkNumber(p);
        System.out.println(b);
        return b;
    }

}
