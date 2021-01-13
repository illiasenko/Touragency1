package com.solvd.touragency.eurasiatour;

public class Italy extends WestEurope{
    private String place;
    private int time;

    public Italy() {
    }
    public Italy(String place, int time) {
        this.place= place;
        this.time = time;
    }
    public void setPlace(String place) {
        place = place;
    }
    public String getPlace() {
        return place;
    }
    public void setTime(int time) {
        time = time;
    }
    public int getSize() {
        return time;
    }
    public void printFields() {
        System.out.println("Place: " + place);
        System.out.println("Time: " + time);
    }
}