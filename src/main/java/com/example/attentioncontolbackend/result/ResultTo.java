package com.example.attentioncontolbackend.result;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class ResultTo {

    private Integer id;
    private String playerName;
    private int score;
    private LocalDate date;
    private Integer[] gameboard;

    public ResultTo() {
    }

    public ResultTo(Integer id, String playerName, int score, LocalDate date, Integer[] gameboard) {
        this.id = id;
        this.playerName = playerName;
        this.score = score;
        this.date = date;
        this.gameboard = gameboard;
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

    public Integer[] getGameboard() {
        return gameboard;
    }

    public void setGameboard(Integer[] gameboard) {
        this.gameboard = gameboard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultTo resultTo = (ResultTo) o;
        return score == resultTo.score &&
                Objects.equals(id, resultTo.id) &&
                Objects.equals(playerName, resultTo.playerName) &&
                Objects.equals(date, resultTo.date) &&
                Arrays.equals(gameboard, resultTo.gameboard);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, playerName, score, date);
        result = 31 * result + Arrays.hashCode(gameboard);
        return result;
    }

    @Override
    public String toString() {
        return "ResultTo{" +
                "Id=" + id +
                ", playerName='" + playerName + '\'' +
                ", score=" + score +
                ", date=" + date +
                ", gameboard=" + Arrays.toString(gameboard) +
                '}';
    }
}
