package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private int secretNumber;
    private Player firstPlayer;
    private Player secondPlayer;

    private int checkNumber;
    private int attempt;
    
    Scanner scan = new Scanner(System.in);
    
    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        System.out.println("Every player have 10 attempts");

        secretNumber = (int) (Math.random() * 101);
        attempt = 1;

        do {
            enterNumber(firstPlayer);
            if (checkNumbers(firstPlayer)) {
                break;
            }
            enterNumber(secondPlayer);
            if (checkNumbers(secondPlayer)) {
                break;
            }
            attempt++;
        } while (attempt < 11);

        displayNumbers(firstPlayer);
        displayNumbers(secondPlayer);
        firstPlayer.clear();
        secondPlayer.clear();
    }

    private void enterNumber(Player player) {
        System.out.print(player.getName() + ", This your " + attempt + " attempt, enter number: ");
        int number = scan.nextInt();
        player.setNumber(attempt, number);
    }

    private boolean checkNumbers(Player player) {
        if (attempt == 10) {
            System.out.println("Player, " + player.getName() + ", last attempts ");
            return true;
        }

        if (player.getNumber(attempt) != secretNumber) {
            String compare = player.getNumber(attempt) > secretNumber ? "more" : "less";
            System.out.println("This number " + compare + ", than guess PC !");
        } else {
            System.out.println("WIN!!! Player, " + player.getName() + ", guess number: " + player.getNumber(attempt) + " with " + attempt + " attempt ");
            return true;
        } 
        return false;
    }

    private void displayNumbers(Player player) {
        int[] numbers = player.getNumbers(attempt);
        System.out.println("Player, " + player.getName() + ", entered numbers: " );
        for(int number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

