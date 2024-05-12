package org.example;

public class Lentils extends Carbs{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding lentils to meal...");
    }

    Lentils(){
        addCarbs();
        addMacronutrient();
    }

    public void printMacronutrient(){
        printCarbs();
        System.out.print("Lentils ");
    }
}
