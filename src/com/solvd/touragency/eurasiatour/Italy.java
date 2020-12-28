package com.solvd.touragency.eurasiatour;

public class Italy extends WestEurope{


    private String place;
    private int time;
    public final String period = "winter";


    public Italy() {
    }

    public Italy(String place1, int time1) {
        place = place1;
        time = time1;
    }

    public void setPlace(String place2) {
        place = place2;
    }

    public String getPlace() {
        return place;
    }

    public void setTime(int time2) {
        time = time2;
    }


    public int getSize() {
        return time;
    }

    public void printFields() {
        System.out.println("Place: " + place);
        System.out.println("Time: " + time);
    }
}