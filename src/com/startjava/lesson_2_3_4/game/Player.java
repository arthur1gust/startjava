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

    public void setNumber(int point, int number) {
        this.numbers[point - 1] = number;
    }

    public int getNumber(int point) {
        return numbers[point - 1];
    }

    public int[] getNumbers(int point) {
        return Arrays.copyOf(numbers, point);
    }
}