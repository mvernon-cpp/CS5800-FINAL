package org.example;

public class Tuna extends Fats{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding tuna to meal plan...");
    }

    Tuna(){
        addFats();
        addMacronutrient();
    }

    public void printMacronutrient(){
        printFats();
        System.out.print("Tuna ");
    }
}
