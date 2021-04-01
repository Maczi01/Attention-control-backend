package com.example.attentioncontolbackend.logic;

import org.springframework.stereotype.Component;

@Component
public class GameMapper {

    public GameTo map(Game game){
        return new GameTo(game.getBoard(), game.getCounter(), game.getEndOfGameTime());
    }

}
