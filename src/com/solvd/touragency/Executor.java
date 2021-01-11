package com.solvd.touragency;

import com.solvd.touragency.eurasiatour.Coliseum;
import com.solvd.touragency.eurasiatour.Europe;
import com.solvd.touragency.eurasiatour.Asia;
import com.solvd.touragency.eurasiatour.Japan;
import com.solvd.touragency.americatour.America;
import com.solvd.touragency.americatour.Usa;
import com.solvd.touragency.eurasiatour.EastAsia;
import com.solvd.touragency.eurasiatour.Rome;
import com.solvd.touragency.eurasiatour.Spain;
import com.solvd.touragency.worldtour.World;
import com.solvd.touragency.additionals.Additional;
import com.solvd.touragency.additionals.AdditionalException;



public class Executor {


    public static void main(String[] args) throws AdditionalException {


        Europe europe = new Europe();
        europe.printInfo();

        Asia eastasia = new EastAsia();
        eastasia.greetings();

        Europe rome = new Rome();
        rome.run();


        Usa usa = new Usa();


        World world = new World();

        world.addEurasia(rome);
        world.addEurasia(eastasia);
        world.addAmerica(usa);
        world.addEurasia(europe);

        world.addSummerTour(europe);
        world.addSummerTour(europe);
        world.addSummerTour(europe);

        world.printInfo();



       Additional adds = new Additional("Food for free");
        adds.AlcoholFree();
        adds.FoodFree();
        try {
            adds.dinner();
        } catch (AdditionalException e) {
            System.out.println(e.getMessage());
            System.out.println("having Tequila for free" + adds.AlcoholFree + "mussels for free "
                    + adds.FoodFree);
        } finally {
            System.out.println("have a nice dinner");
        }
    }
    }
