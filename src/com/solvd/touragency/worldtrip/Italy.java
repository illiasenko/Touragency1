package com.solvd.touragency.worldtrip;

public class Italy extends WestEurope{


    private String place;
    private int time;

    public Italy() {

    }

    public Italy(String place1, int time1) {
        place = place1;
        time = time1;
    }

    public void setVoice(String place2) {
        place = place2;
    }


    public String getVoice() {

        return place;
    }

    public void setSize(int time2) {

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
