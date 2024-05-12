package org.example;

public class Sour_Cream extends Fats{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding sour cream to meal plan...");
    }

    Sour_Cream(){
        addFats();
        addMacronutrient();
    }

    public void printMacronutrient(){
        printFats();
        System.out.print("Sour Cream ");
    }
}

