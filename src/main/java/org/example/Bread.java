package org.example;

public class Bread extends Carbs{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding bread to meal plan...");
    }

    Bread(){
        addCarbs();
        addMacronutrient();
    }

    public void printMacronutrient(){
        printCarbs();
        System.out.print("Bread ");
    }
}
