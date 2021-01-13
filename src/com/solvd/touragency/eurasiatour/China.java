package com.solvd.touragency.eurasiatour;

public class China extends EastAsia {

    private String place;
    private int time;

    public China() {
    }


    public China(String place, int time) {
        this.place = place;
        this.time = time;
    }

    public void setVoice(String place3) {
        place = place3;
    }
    public String getVoice() {
        return place;
    }
    public void setSize(int time) {
        this.time = time;
    }


    public int getSize() {
        return time;
    }
    public void greetings(){
        super.greetings();
        System.out.println("Hello from China");
    }

    public void printFields() {
        System.out.println("Place: " + place);
        System.out.println("Time: " + time);
    }
}