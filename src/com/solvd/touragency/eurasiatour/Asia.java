package com.solvd.touragency.eurasiatour;


public abstract class Asia implements Eurasia, Bonus {

    public Asia() {
    }
    @Override
    public void run() {
        System.out.println("AsiaTour!!");
    }
    @Override
    public void printInfo() {
        System.out.println("Let's Go To Asia");
    }
    @Override
    public boolean getBonuses() {
        return false;
    }
    public void greetings() {
        System.out.println("Greetings from Asia");
    }
}