package com.solvd.touragency;
import com.solvd.touragency.eurasiatour.*;
import com.solvd.touragency.americatour.Usa;
import com.solvd.touragency.utils.ReadingFromFile;
import com.solvd.touragency.utils.WritingFromProp;
import com.solvd.touragency.utils.WritingToFile;
import com.solvd.touragency.worldtour.World;
import com.solvd.touragency.additionals.Additional;
import com.solvd.touragency.additionals.AdditionalException;
import java.io.File;


public class Executor {
    static String separator = File.separator;
    static String pathFirst =  "C:" + separator + "Users" + separator + "ilyxa" + separator + "IdeaProjects"
            + separator + "lesson_7" + separator + "src" + separator + "Visa.txt";
    static String pathSecond = "C:" + separator + "Users" + separator + "ilyxa" + separator + "IdeaProjects"
            + separator + "lesson_7" + separator + "src" + separator + "List.properties";

    public static void main(String[] args) throws AdditionalException {

        WritingFromProp wfp = new WritingFromProp();
        wfp.setValueToProperties("pathSecond", "place", "tour");
        String infofromProperty = wfp.getValueFromProperties("pathSecond", "Tour");
        System.out.println(infofromProperty);
        wfp.getValueFromProperties(pathSecond, "TourTo");
        System.out.println("=========");
        wfp.setValueToProperties(pathSecond, "TourTo", "Round the Europe");


        WritingToFile wtf = new WritingToFile();
		wtf.writeTorFile(pathFirst, "Europe");


        System.out.println("==============");

        Asia japan = new Japan();
        Europe rome = new Rome();
        Usa usa = new Usa();
        Spain spain = new Spain();
        System.out.println("==============");

        World world = new World();
        world.addEurasia(spain);
        world.addEurasia(japan);
        world.addAmerica(usa);
        world.addEurasia(rome);
        System.out.println("==============");
        world.addSummerTour(rome);
        world.addSummerTour(rome);
        world.addSummerTour(rome);
        world.printInfo();
        System.out.println("==============");

        Additional add = new Additional("Food for free");
        try {
            add.dinner();
        } catch (AdditionalException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Have a nice dinner");
        }

    }
}