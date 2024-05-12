package org.example;

public class Chicken extends Protein{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding chicken to meal plan...");
    }

    Chicken(){
        addProtein();
        addMacronutrient();
    }

    public void printMacronutrient(){
        printProtein();
        System.out.print("Chicken ");
    }
}
