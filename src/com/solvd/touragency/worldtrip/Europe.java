package com.solvd.touragency.worldtrip;

public class Europe implements World {

    @Override
    public void run() {
        System.out.println("EuropeTour");
    }

    @Override
    public void printInfo() {
        System.out.println("TourtoEurope");
    }
}
