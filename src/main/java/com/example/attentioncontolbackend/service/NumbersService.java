package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.logic.Game;
import org.springframework.stereotype.Service;

@Service
public class NumbersService {

    private final Game game;

    public NumbersService(Game game) {
        this.game = game;
    }

    public int[] startGame(){
        return  game.generateMixedArray();
    }


    public boolean checkNumber(String p) {
        return game.checkNumber(p);
//        System.out.println(b);
    }
}
