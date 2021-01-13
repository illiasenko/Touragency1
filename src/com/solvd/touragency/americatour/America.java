package com.solvd.touragency.americatour;


public abstract class America {
    private String place;
    private int time;
    private int price;
    private boolean isyacht = false;

    public America() {
    }

    public America(String place, int time, int price) {
        this.price = price;
        this.place = place;
        this.time = time;
    }

    abstract public void printInfo();

    public boolean yacht(boolean isyacht) {
        this.isyacht = isyacht;

        return this.isyacht;
    }

    public String getPlace() {
        return place;
    }

    public int getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }
}