package org.example;

import java.util.Random;

public class Protein_Factory implements Macronutrient_Factory{
    private static Protein_Factory instance = null;
    private Protein_Factory(){}
    public static Protein_Factory getInstance(){
        if (instance == null)
            instance = new Protein_Factory();
        return instance;
    }

    public Macronutrient gatherMacronutrient(Diet diet){
        Random rand = new Random();
        String random_selection = diet.protein.get(rand.nextInt(diet.protein.size()));
        switch (random_selection){
            case "fish":
                return new Fish();
            case "chicken":
                return new Chicken();
            case "beef":
                return new Beef();
            case "tofu":
                return new Tofu();
            default:
                return null;
        }
    }
}
