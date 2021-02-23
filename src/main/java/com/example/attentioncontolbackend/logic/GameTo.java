package com.example.attentioncontolbackend.logic;

public class GameTo {

    private int[] board;
    private int counter = 0;
    private int endOfGameTime;

    public GameTo(int[] board, int counter, int endOfGameTime) {
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

    public int getEndOfGameTime() {
        return endOfGameTime;
    }

    public void setEndOfGameTime(int endOfGameTime) {
        this.endOfGameTime = endOfGameTime;
    }
}
