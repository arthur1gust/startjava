package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private String status;
    private float height;
    private float weight;

    public Jaeger(String modelName, String mark, String origin, String status, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.status = status;
        this.height = height;
        this.weight = weight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    boolean drift() {
        System.out.println("You completed drift");
        return true;
    }

    void move() {
        System.out.println("You walked 5 steps");
    }

    String scanKaiju() {
        return "nothing";
    }
}