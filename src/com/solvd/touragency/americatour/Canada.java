package com.solvd.touragency.americatour;

public class Canada extends Usa {

    private String place;
    private int time;
    private int price;

    public Canada() {

    }

    public Canada(String place) {
        this.place = place;
    }

    @Override
    public void printInfo() {

    }

    @Override
    public String getPlace() {
        return this.place;
    }

}