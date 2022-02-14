package com.company;

public class Turtle extends Animal{

    private int age;

    public Turtle() {
    }

    public Turtle(double weight, String color, int age) {
        super(weight, color);
        this.age = age;
    }

    public void swim() {
        System.out.println("Turtle is more active in water than on land.");
    }

    @Override
    public void survival () {
        System.out.println("Each animal survives its own way.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Turtle information: " +'\n'+
                "age=" + age +'\n'+
                super.toString();
    }
}