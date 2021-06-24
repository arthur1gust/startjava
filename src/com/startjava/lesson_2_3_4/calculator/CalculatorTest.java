package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        
        String playerAnswer = "";
        String mathExpression = "";

        do {
            System.out.print("Enter math example (use space!!!): ");
            mathExpression = scan.nextLine();

            System.out.println("Result calculate = " + calc.calculate(mathExpression));

            System.out.print("Will you want continue? [yes/no]: ");
            while (!scan.hasNext("yes") && !scan.hasNext("no")) {
                playerAnswer = scan.nextLine();
                if (!playerAnswer.equals("yes") || !playerAnswer.equals("no")) {
                    System.out.print("Enter correct value: ");
                }
            }
        } while (scan.nextLine().equalsIgnoreCase("yes")); 
    }
}