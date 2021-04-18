package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.logic.*;
import com.example.attentioncontolbackend.service.exception.WrongNumberException;
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

    public boolean checkNumber(String p) throws WrongNumberException {
        Integer nubmerToCheck = Integer.valueOf(p);
        if (nubmerToCheck<0 || nubmerToCheck>99){
            throw new WrongNumberException(nubmerToCheck);
        }
        return game.checkNumber(p);
    }

    public boolean checkGivenNumber(NumberTo numberTo) {
        return game.checkGivenNumber(numberTo);
    }

    public int getResult() {
        return game.getCounter();
    }
}
