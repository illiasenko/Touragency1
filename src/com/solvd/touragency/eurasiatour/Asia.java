package com.solvd.touragency.eurasiatour;


public class Asia implements Eurasia, Visa {

    public Asia() {
    }

    @Override
    public void run() {
        System.out.println("AsiaTour!!");
    }

    @Override
    public void printInfo() {
        System.out.println("BigTourAsia");
    }

    @Override
    public boolean getSchengen() {
        return false;
    }
    public void greetings() {
        System.out.println("Greetings from Asia");
    }

}