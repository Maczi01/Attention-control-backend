package com.example.attentioncontolbackend.result;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Result {

    private Long Id;
    private String playerName;
    private int score;
    private LocalDate date;
    private int [] gameboard;

    public Result() {
    }

    public Result(Long id, String playerName, int score, LocalDate date, int[] gameboard) {
        Id = id;
        this.playerName = playerName;
        this.score = score;
        this.date = date;
        this.gameboard = gameboard;
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

    public int[] getGameboard() {
        return gameboard;
    }

    public void setGameboard(int[] gameboard) {
        this.gameboard = gameboard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return score == result.score &&
                Objects.equals(Id, result.Id) &&
                Objects.equals(playerName, result.playerName) &&
                Objects.equals(date, result.date) &&
                Arrays.equals(gameboard, result.gameboard);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(Id, playerName, score, date);
        result = 31 * result + Arrays.hashCode(gameboard);
        return result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "Id=" + Id +
                ", playerName='" + playerName + '\'' +
                ", score=" + score +
                ", date=" + date +
                ", gameboard=" + Arrays.toString(gameboard) +
                '}';
    }
}
