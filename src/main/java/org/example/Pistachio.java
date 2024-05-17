package org.example;

public class Pistachio extends Carbs{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding pistachio to meal...");
    }

    Pistachio(){
        addCarbs();
        addMacronutrient();
    }

    public void printMacronutrient(){
        printCarbs();
        System.out.print("Pistachio ");
    }
}
