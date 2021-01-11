package com.solvd.touragency.americatour;

public class Usa extends America {

    public Usa() {

    }

    public Usa(String place, int price, int time) {
        super(place, price, time);
    }

    @Override
    public void printInfo() {
        System.out.println("CometoUsa");
        System.out.println("place: " + getPlace());
        System.out.println("price: " + getPrice());
        System.out.println("time: " + getTime());
        System.out.println(yacht(true));
    }

}