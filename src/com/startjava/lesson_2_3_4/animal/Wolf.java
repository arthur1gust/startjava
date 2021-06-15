package com.startjava.lesson_2_3_4.animal;

public class Wolf {
    private String maleGender;
    private String name;
    private double weight;
    private int age;
    private String color;

    public String getMaleGender() {
        return maleGender;
    }

    public void setMaleGender(String maleGender) {
        this.maleGender = maleGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int sum = age - 8;
        if(sum > 0) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.print("Going...\n");
    }

    public void sit() {
        System.out.print("Sitting...\n");
    }

    public void run() {
        System.out.print("Running...\n");
    }

    public void howl() {
        System.out.print("Howling...\n");
    }

    public void hunt() {
        System.out.print("Hunting...\n");
    }
}