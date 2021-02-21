package com.example.attentioncontolbackend.logic;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

@Component
public class Game {

    private Random rand = new Random();
    private int[] board = new int[100];
    private int counter = 0;
    private boolean isPlaying;
    private int result;
    private LocalDateTime endOfGameTime;

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
        board = generateMixedArray();
        counter = 0;
        result = 0;
        endOfGameTime = createEndOfGameTime();
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

}
