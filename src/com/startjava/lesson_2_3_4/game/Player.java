package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int attempt, int number) {
        numbers[attempt - 1] = number;
    }

    public int getNumber(int attempt) {
        return numbers[attempt - 1];
    }

    public int[] getNumbers(int attempt) {
        return Arrays.copyOf(numbers, attempt);
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 1;
    }
}