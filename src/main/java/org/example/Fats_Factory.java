package org.example;

import java.util.Random;

public class Fats_Factory implements Macronutrient_Factory{
    private static Fats_Factory instance = null;
    private Fats_Factory(){}
    public static Fats_Factory getInstance(){
        if (instance == null)
            instance = new Fats_Factory();
        return instance;
    }

    public Macronutrient gatherMacronutrient(Diet diet){
        Random rand = new Random();
        String random_selection = diet.fats.get(rand.nextInt(diet.fats.size()));
        switch (random_selection){
            case "avocado":
                return new Avocado();
            case "sour cream":
                return new Sour_Cream();
            case "tuna":
                return new Tuna();
            case "peanuts":
                return new Peanuts();
            default:
                return null;
        }
    }
}
