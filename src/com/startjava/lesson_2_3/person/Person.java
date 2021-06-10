package com.startjava.lesson_2_3.person;

public class Person {
    public boolean male_gender = true;
    public String name = "Alex";
    public double height = 1.8;
    public double weight = 84.8;
    public int age = 28;

    public void walk(){
        System.out.print("Walking...\n");
    }
    public void sit(){
        System.out.print("Sitting...\n");
    }
    public void run(){
        System.out.print("Running...\n");
    }
    public void talk(){
        System.out.print("Talking...\n");
    }
    public void learn(){
        System.out.print("Learning Java...\n");
    }
}