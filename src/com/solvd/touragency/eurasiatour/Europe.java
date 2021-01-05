package com.solvd.touragency.eurasiatour;

public class Europe implements Eurasia, Bonus {

    public Europe() {

    }

    public Europe(String welcome_to_europe) {
    }

    @Override
    public void run() {
        System.out.println("EuropeTour");
    }

    @Override
    public void printInfo() {
        System.out.println("TourtoEurope");
    }

    @Override
    public boolean getBonuses() {
        return false;
    }
}
