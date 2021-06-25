package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int index, int number) {
        numbers[index - 1] = number;
    }

    public int getNumber(int index) {
        return numbers[index - 1];
    }

    public int[] getNumbers(int index) {
        return Arrays.copyOf(numbers, index);
    }
}