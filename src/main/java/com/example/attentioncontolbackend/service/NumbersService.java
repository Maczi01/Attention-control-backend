package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.logic.*;
import org.springframework.stereotype.Service;

@Service
public class NumbersService {

    private final Game game;
    private GameMapper gameMapper;

    public NumbersService(Game game, GameMapper gameMapper) {
        this.game = game;
        this.gameMapper = gameMapper;
    }

    public GameTo initGame() {
        this.game.initGame();
        return gameMapper.map(game);
    }

    public int[] startGame() {
        return game.generateMixedArray();
    }

    public boolean checkNumber(String p) {
        return game.checkNumber(p);
    }

    public boolean checkGivenNumber(NumberTo numberTo) {
        return game.checkGivenNumber(numberTo);
    }

    public int getResult() {
        return game.getCounter();
    }
}
