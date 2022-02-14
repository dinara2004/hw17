package com.company;

public class Shark extends Animal{

    private boolean predator;

    public Shark() {

    }

    public Shark(double weight, String color, boolean predator) {
        super(weight, color);
        this.predator = predator;
    }

    public void attack() {
        System.out.println("Shark is dangerous animal.");
    }

    @Override
    public void survival () {
        super.survival();
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    @Override
    public String toString() {
        return "Shark: " +'\n'+
                "predator: " + predator +'\n'+
                super.toString();
    }
}
