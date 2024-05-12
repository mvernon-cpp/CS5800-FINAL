package org.example;

public class Tofu extends Protein{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding tofu to meal...");
    }

    Tofu(){
        addProtein();
        addMacronutrient();
    }

    public void printMacronutrient(){
        printProtein();
        System.out.print("Tofu ");
    }
}
