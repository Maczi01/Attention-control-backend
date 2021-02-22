package com.example.attentioncontolbackend.logic;

import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public GameTo map(Game game){
        return new GameTo(game.getBoard(), game.getCounter(), game.getEndOfGameTime());
    }

}
