package com.example.attentioncontolbackend.result;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String playerName;
    private int score;
    private LocalDate date;
//    @CollectionTable(name = "gameBoard", joinColumns = @JoinColumn(name = "result_id"))
    @ElementCollection
//    @Column(name = "game_board")
    private List<Integer> gameBoard;
    private double accuracy;

    public Result() {
    }

    public Result(Integer id, String playerName, int score, LocalDate date, List<Integer> gameBoard, double accuracy) {
        this.id = id;
        this.playerName = playerName;
        this.score = score;
        this.date = date;
        this.gameBoard = gameBoard;
        this.accuracy = accuracy;
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

    public List<Integer> getgameBoard() {
        return gameBoard;
    }

    public void setgameBoard(List<Integer> gameBoard) {
        this.gameBoard = gameBoard;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }
}