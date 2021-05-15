package com.example.attentioncontolbackend.logic;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Game {

    private Random rand = new Random();
    private int[] board;
    private int counter = 0;
    private int endOfGameTime = 10;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Random getRand() {
        return rand;
    }

    public int[] getBoard() {
        return board;
    }


    public int getCounter() {
        return this.counter;
    }


    public int getEndOfGameTime() {
        return endOfGameTime;
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
        this.endOfGameTime = 90;
    }

    public boolean checkNumber(String p) {
        int givenNumber = Integer.parseInt(p);
        if (givenNumber == counter) {
            counter++;
            return true;
        }
        return false;
    }

    public boolean checkGivenNumber(NumberTo numberTo) {
        if (numberTo.getIndex() == counter) {
            counter++;
            return true;
        }
        return false;
    }
}
