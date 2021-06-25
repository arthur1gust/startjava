package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first name player: ");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.print("Enter second name player: ");
        Player secondPlayer = new Player(scan.nextLine());
        
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        
        String playerAnswer = "";
        
        do {
            game.start();
            System.out.print("Will you want continue? [yes/no]: ");
            while (!scan.hasNext("yes") && !scan.hasNext("no")) {
                playerAnswer = scan.nextLine();
                if (playerAnswer.equals("yes") || playerAnswer.equals("no")) {
                    break;
                } else {
                    System.out.print("Enter correct value: ");
                }
            }
        } while (scan.nextLine().equalsIgnoreCase("yes"));
    }
}