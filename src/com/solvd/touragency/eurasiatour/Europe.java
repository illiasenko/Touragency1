package com.solvd.touragency.eurasiatour;

public abstract class Europe implements Eurasia, Bonus {

    public Europe() {
    }
    @Override
    public void run() {
        System.out.println("Euro Tour");
    }
    @Override
    public void printInfo() {
        System.out.println("Tour around the whole Europe");
    }
    @Override
    public boolean getBonuses() {
        return false;
    }
}