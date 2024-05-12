package org.example;

public class Peanuts extends Fats{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding peanuts to meal plan...");
    }

    Peanuts(){
        addFats();
        addMacronutrient();
    }

    public void printMacronutrient(){
        printFats();
        System.out.print("Peanuts ");
    }
}