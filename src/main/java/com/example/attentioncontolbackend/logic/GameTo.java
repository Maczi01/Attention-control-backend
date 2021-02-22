package com.example.attentioncontolbackend.logic;

import java.time.LocalDateTime;

public class GameTo {

    private int[] board;
    private int counter = 0;
    private LocalDateTime endOfGameTime;

    public GameTo(int[] board, int counter, LocalDateTime endOfGameTime) {
        this.board = board;
        this.counter = counter;
        this.endOfGameTime = endOfGameTime;
    }

    public int[] getBoard() {
        return board;
    }

    public void setBoard(int[] board) {
        this.board = board;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public LocalDateTime getEndOfGameTime() {
        return endOfGameTime;
    }

    public void setEndOfGameTime(LocalDateTime endOfGameTime) {
        this.endOfGameTime = endOfGameTime;
    }
}
