package com.solvd.touragency;

import com.solvd.touragency.eurasiatour.Coliseum;
import com.solvd.touragency.eurasiatour.Europe;
import com.solvd.touragency.eurasiatour.Asia;
import com.solvd.touragency.eurasiatour.Japan;


class Executor {


    public static void main(String[] args) {



        Europe europe = new Europe();
        europe.printInfo();

        Asia japan = new Japan();
        japan.greetings();

        Europe coliseum = new Coliseum();
        coliseum.run();
    }
}