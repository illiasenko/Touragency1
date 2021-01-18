package com.solvd.touragency.eurasiatour;

public final class Spain extends WestEurope {
    int city = 5;
    private String place;
    public Spain(){

        switch (city) {
            case 1:
                System.out.println("Visit Madrid");
                break;
            case 2:
                System.out.println("Visit Barcelona");
                break;
            case 3:
                System.out.println("Visit Vigo");
                break;
            case 4:
                System.out.println("Visit Sevilla");
                break;
            case 5:
                System.out.println("Visit Malaga");
                break;
        }
    }
}
