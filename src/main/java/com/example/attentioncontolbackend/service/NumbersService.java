package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.logic.Game;
import com.example.attentioncontolbackend.logic.GameTo;
import com.example.attentioncontolbackend.logic.Mapper;
import com.example.attentioncontolbackend.logic.NumberTo;
import org.springframework.stereotype.Service;

@Service
public class NumbersService {

    private final Game game;
    private Mapper mapper;

    public NumbersService(Game game, Mapper mapper) {
        this.game = game;
        this.mapper = mapper;
    }


    public GameTo initGame() {
        this.game.initGame();
        return mapper.map(game);
    }


    public int[] startGame()  {
        return  game.generateMixedArray();
    }


    public boolean checkNumber(String p) {
        return game.checkNumber(p);
    }
//TODO use transfer object
    public boolean checkGivenNumber(NumberTo numberTo) {
        return game.checkGivenNumber(numberTo);
    }
}
