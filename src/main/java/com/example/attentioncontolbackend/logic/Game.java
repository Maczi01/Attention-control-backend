package com.example.attentioncontolbackend.logic;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

@Component
public class Game {

    private Random rand = new Random();
    private int[] board;
    private int counter = 0;
    private LocalDateTime endOfGameTime;



    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
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

    public int[] generateNumbers() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public int[] generateMixedArray(){
        int[] array = generateNumbers();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public void initGame() {
        this.board = generateMixedArray();
        this.counter = 0;
        this.endOfGameTime = createEndOfGameTime();
    }

    public boolean checkNumber(String p) {
        int givenNumber = Integer.parseInt(p);
        if (givenNumber == counter) {
            counter++;
            return true;
        }
        return false;
    }

    public LocalDateTime createEndOfGameTime(){
        return LocalDateTime.now().plusSeconds(90);
    }

    public boolean checkGivenNumber(Number number) {
        if (number.getIndex() == counter) {
            counter++;
            return true;
        }
        return false;
    }
}
