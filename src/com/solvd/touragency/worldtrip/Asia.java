package com.solvd.touragency.worldtrip;

public class Asia implements World, Japan{

    public Asia() {
    }

    @Override
    public void run() {
        System.out.println("AsiaTour!!");
    }

    @Override
    public void printInfo() {
        System.out.println("BigTourAsia");

    }
    @Override
    public boolean getYen() {
        return false;
    }
}