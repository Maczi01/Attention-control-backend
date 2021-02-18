package com.example.attentioncontolbackend.logic;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component
public class Game {

    private Random rand = new Random();
    private int[] board = new int[99];
    private int counter;
    private boolean isPlaying;
    private int result;

    public int[] generateNumbers() {
        int[] array = new int[99];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public int[] generateMixedArray() {
        int[] array = generateNumbers();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public void initGame(){
        board = generateMixedArray();
        counter = 0;
        result = 0;
        isPlaying = true;
    }
}
