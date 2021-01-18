package com.solvd.touragency.worldtour;

import com.solvd.touragency.americatour.America;
import com.solvd.touragency.eurasiatour.Eurasia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class World {


    List<Eurasia> corral;
    List<America> slot;
    Set<Eurasia> summerTour;

    public  int time = 14;

    public World() {
        corral = new ArrayList<Eurasia>();
        slot = new LinkedList<America>();
        summerTour = new HashSet<Eurasia>();

    }

    public World(Eurasia eurasia, America america ) {
        corral = new ArrayList<Eurasia>();
        slot = new LinkedList<America>();
        time ++;
    }

    public void addEurasia(Eurasia eurasia) {
        corral.add(eurasia);
    }
    public void addAmerica(America america) {
        slot.add(america);
    }
    public void addSummerTour(Eurasia eurasia) {
        summerTour.add(eurasia);
    }
    public void printInfo() {
        System.out.println("=====Eurasia Tour====");

        for (Eurasia eurasia : corral) {
            System.out.println(eurasia.toString());;
        }
        System.out.println("=====America Tour======");

        for (America america : slot) {
            System.out.println(america.toString());;
        }
        System.out.println("=====Summer Tour======");

        for (Eurasia eurasia : summerTour) {
            System.out.println(eurasia.toString());;
        }
    }
}