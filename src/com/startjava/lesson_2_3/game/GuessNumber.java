package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    
    Scanner scan = new Scanner(System.in);
    
    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        secretNumber = (int) (Math.random() * 101);
        while (true) {
            enterNumber(firstPlayer);
            if (checkNumber(firstPlayer)) {
                break;
            }
            enterNumber(secondPlayer);
            if (checkNumber(secondPlayer)) {
                break;
            }
        }
    }

    private void enterNumber(Player player) {
        System.out.println("Player - " + player.getName() + " - enter number:");
        player.setNumber(scan.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.print("Player - " + player.getName() + " - WIN!!! ");
            return true;
        } else if (player.getNumber() > secretNumber) {
            System.out.println("Your number is big");
        } else {
            System.out.println("Your number is less");
        }
        return false;
    }
}