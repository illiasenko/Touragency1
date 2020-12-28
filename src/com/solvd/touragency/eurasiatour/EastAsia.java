package com.solvd.touragency.eurasiatour;

public class EastAsia extends Asia{

    private String place;
    private int time;

    public EastAsia() {

    }

    public void setPlace(String place) {
        this.place = place;
    }
    public String getPlace() {
        return this.place;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public void printFields() {
        System.out.println("Place: " + this.place);
        System.out.println("Time: " + this.time);
    }
}