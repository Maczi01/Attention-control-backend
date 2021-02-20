package com.example.attentioncontolbackend.logic;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component
public class Game {

    private Random rand = new Random();
    private int[] board = new int[100];
    private int counter = 0;
    private boolean isPlaying;
    private int result;

    public int[] generateNumbers() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(array.length);
        return array;
    }

    public int[] generateMixedArray() throws InterruptedException {
        int[] array = generateNumbers();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        for (int seconds=60  ; seconds >= 0 ; seconds--)
        {
            System.out.println(seconds);
            Thread.sleep(1000);
        }
        return array;
    }

    public void initGame() throws InterruptedException {
        board = generateMixedArray();
        counter = 0;
        result = 0;
        isPlaying = true;
    }

    public boolean checkNumber(String p) {
        int givenNumber = Integer.parseInt(p);
        if (givenNumber == counter) {
            counter++;
            return true;
        }
        return false;
    }
}
