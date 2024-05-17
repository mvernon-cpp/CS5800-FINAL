package org.example;

public class Cheese extends Carbs{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding cheese to meal...");
    }

    Cheese(){
        addCarbs();
        addMacronutrient();
    }

    public void printMacronutrient(){
        printCarbs();
        System.out.print("Cheese ");
    }
}