package org.example;

import java.util.Random;
public class Carbs_Factory implements Macronutrient_Factory{
    private static Carbs_Factory instance = null;
    private Carbs_Factory(){}
    public static Carbs_Factory getInstance(){
        if (instance == null)
            instance = new Carbs_Factory();
        return instance;
    }
    public Macronutrient gatherMacronutrient(Diet diet){
        Random rand = new Random();
        String random_selection = diet.carbs.get(rand.nextInt(diet.carbs.size()));
        switch (random_selection){
            case "bread":
                return new Bread();
            case "cheese":
                return new Cheese();
            case "pistachio":
                return new Pistachio();
            case "lentils":
                return new Lentils();
            default:
                return null;
        }
    }

}
