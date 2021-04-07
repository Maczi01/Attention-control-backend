package com.example.attentioncontolbackend.player;

import java.time.LocalDate;

public class ResultTo {

    private Long Id;
    private String playerName;
    private int score;
    private LocalDate date;

    public ResultTo() {
    }

    public ResultTo(Long id, String playerName, int score, LocalDate date) {
        Id = id;
        this.playerName = playerName;
        this.score = score;
        this.date = date;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
