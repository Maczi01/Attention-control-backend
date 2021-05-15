package com.example.attentioncontolbackend.result;

import java.time.LocalDate;
import java.util.List;

public class ResultTo {

    private Integer id;
    private String playerName;
    private int score;
    private LocalDate date;
    private List<Integer> gameboard;
    private double accuracy;

    public ResultTo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Integer> getGameboard() {
        return gameboard;
    }

    public void setGameboard(List<Integer> gameboard) {
        this.gameboard = gameboard;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "ResultTo{" +
                "id=" + id +
                ", playerName='" + playerName + '\'' +
                ", score=" + score +
                ", date=" + date +
                ", gameboard=" + gameboard +
                ", accuracy=" + accuracy +
                '}';
    }
}
