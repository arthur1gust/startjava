package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private int secretNumber;
    private Player firstPlayer;
    private Player secondPlayer;

    private int checkNumber;
    private int point;
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
        point = 1;

        while (!checkWin && point <= 10) {
            enterNumberPlayer(firstPlayer);
            checkNumbers(firstPlayer);
            enterNumberPlayer(secondPlayer);
            checkNumbers(secondPlayer);
            point++;
        }
    }

    private int enterNumber(Player player) {
        System.out.print(player.getName() + ", This your " + point + " attempt, enter number: ");
            checkNumber = scan.nextInt();
            return checkNumber;
    }

    private void enterNumberPlayer(Player player) {
        int number = enterNumber(player);
        player.setNumber(point, number);
    }

    private void checkNumbers(Player player) {
        if (point == 10) {
            System.out.println("Player, " + player.getName() + ", lost attempts ");
            endGame(player);
        }
        
        if (player.getNumber(point) == secretNumber) {
            System.out.println("WIN!!! Player, " + player.getName() + ", guess number: " + player.getNumber(point) + " with " + point + " attempt ");
            checkWin = true;
            endGame(player);
        } else if (player.getNumber(point) < secretNumber) {
            System.out.println("Your number is less!");
        } else {
            System.out.println("Your number is big!");
        }
    }

    private void endGame(Player player) {
        displayShow(player);
    }

    private void displayShow(Player player) {
        int[] numbers = player.getNumbers(point);
        System.out.println("Player, " + player.getName() + ", entered numbers: " );
        System.out.println(Arrays.toString(numbers));
    }
}

