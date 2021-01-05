package com.solvd.touragency;

import com.solvd.touragency.eurasiatour.Coliseum;
import com.solvd.touragency.eurasiatour.Europe;
import com.solvd.touragency.eurasiatour.Asia;
import com.solvd.touragency.eurasiatour.Japan;
import com.solvd.touragency.americatour.America;
import com.solvd.touragency.americatour.Usa;

import com.solvd.touragency.worldtour.World;


public class Executor {


    public static void main(String[] args) {

        Europe europe = new Europe();
        europe.printInfo();

        Asia japan = new Japan();
        japan.greetings();

        Europe coliseum = new Coliseum();
        coliseum.run();


        Usa usa = new Usa();


        World world = new World();

        world.addEurasia(europe);
        world.addEurasia(europe);
        world.addAmerica(usa);
        world.addEurasia(europe);

        world.addSummerTour(europe);
        world.addSummerTour(europe);
        world.addSummerTour(europe);

        world.pritnIfo();
    }
}

