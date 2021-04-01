package com.example.attentioncontolbackend.player;

import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {

    public PlayerTo map2To(Player player) {
        if (player != null) {
            PlayerTo playerTo = new PlayerTo();
            playerTo.setId(player.getId());
            playerTo.setName(player.getName());
            playerTo.setResult(player.getResult());
            return playerTo;
        }
        return null;
    }

    public Player map2Entity(PlayerTo playerTo) {
        if (playerTo != null) {
            Player player = new Player();
            player.setId(playerTo.getId());
            player.setName(playerTo.getName());
            player.setResult(playerTo.getResult());
            return player;
        }
        return null;
    }

}
