package com.example.attentioncontolbackend.player;

import java.time.LocalDate;
import java.util.Objects;

public class Result {

    private Long Id;
    private String playerName;
    private int score;
    private LocalDate date;

    public Result() {
    }

    public Result(Long id, String playerName, int score, LocalDate date) {
        this.Id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return score == result.score &&
                Objects.equals(Id, result.Id) &&
                Objects.equals(playerName, result.playerName) &&
                Objects.equals(date, result.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, playerName, score, date);
    }

    @Override
    public String toString() {
        return "Result{" +
                "Id=" + Id +
                ", playerName='" + playerName + '\'' +
                ", score=" + score +
                ", date=" + date +
                '}';
    }
}
