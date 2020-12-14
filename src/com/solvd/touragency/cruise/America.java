package com.solvd.touragency.cruise;

public  abstract class America {


    private String place;
    private int time;
    private int price;
    private boolean isYacht = false;

    public America() {

    }

    public America(String place, int time, int price) {
        this.price = price;
        this.place = place;
        this.time = time;
    }

    abstract public  void printInfo();

    public boolean Yacht(boolean isYacht) {
        this.isYacht = isYacht;

        return this.isYacht;
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
