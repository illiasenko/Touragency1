package com.solvd.touragency;

import com.solvd.touragency.worldtrip.Asia;
import com.solvd.touragency.worldtrip.Europe;



public class executor {


    public static void main(String[] args) {

        Europe europe = new Europe();
        europe.printInfo();

        Asia asia = new Asia();
        asia.run();

        System.out.println(asia.getYen());
    }
}