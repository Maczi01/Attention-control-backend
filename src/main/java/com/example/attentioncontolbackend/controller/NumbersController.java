package com.example.attentioncontolbackend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class NumbersController {

    private int[] array = {1,2,3,4,5};

    public NumbersController() {
    }

    @GetMapping()
    public int[] getNumbers(){
        return array;
    }
    @PostMapping()
    public void giveNumbers(@RequestBody String p){
        System.out.println(p);
    }
}
