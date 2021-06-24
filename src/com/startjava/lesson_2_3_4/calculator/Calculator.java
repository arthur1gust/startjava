package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;
import java.util.Scanner;

public class Calculator {
    public double calculate(String mathExpression) {
        String[] splitExpression = mathExpression.split(" ");

        int a = Integer.parseInt(splitExpression[0]);
        char sign = splitExpression[1].charAt(0);
        int b = Integer.parseInt(splitExpression[2]);
        switch (sign) {
            case '+':
                return Math.addExact(a, b);
            case '-':
                return Math.subtractExact(a, b);
            case '*':
                return Math.multiplyExact(a, b);
            case '/':
                return Math.floorDiv(a, b);
            case '^':
                return Math.pow(a, b);
            case '%':
                return Math.floorMod(a, b);
            default:
                System.out.println("Enter other math example");
                return 0;
        }
    }
}