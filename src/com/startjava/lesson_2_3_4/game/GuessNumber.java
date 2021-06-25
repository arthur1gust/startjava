package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private int secretNumber;
    private Player firstPlayer;
    private Player secondPlayer;

    private int checkNumber;
    private int attempt;
    private boolean checkWin;
    
    Scanner scan = new Scanner(System.in);
    
    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        System.out.println("Every player have 10 attempts");

        secretNumber = (int) (Math.random() * 101);
        checkWin = false;
        attempt = 1;

        while (!checkWin && attempt <= 10) {
            enterNumberPlayer(firstPlayer);
            checkNumbers(firstPlayer);
            enterNumberPlayer(secondPlayer);
            checkNumbers(secondPlayer);
            attempt++;
        }
    }

    private void enterNumberPlayer(Player player) {
        System.out.print(player.getName() + ", This your " + attempt + " attempt, enter number: ");
        int number = scan.nextInt();
        player.setNumber(attempt, number);
    }

    private void checkNumbers(Player player) {
        if (attempt == 10) {
            System.out.println("Player, " + player.getName() + ", lost attempts ");
            displayNumbers(player);
        }

        if (player.getNumber(attempt) != secretNumber) {
            String compare = player.getNumber(attempt) > secretNumber ? "big" : "less";
            System.out.println("This number " + compare + ", than guess PC !");
        } else {
            System.out.println("WIN!!! Player, " + player.getName() + ", guess number: " + player.getNumber(attempt) + " with " + attempt + " attempt ");
            checkWin = true;
            displayNumbers(player);
        }
    }

    private void displayNumbers(Player player) {
        int[] numbers = player.getNumbers(attempt);
        System.out.println("Player, " + player.getName() + ", entered numbers: " );
        for(int i: numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

