package org.example;

public abstract class Carbs extends Macronutrient {
    public void addCarbs(){
        System.out.println("Adding carbs...");
    }

    public void printCarbs(){
        System.out.print("Carbs Macro: ");
    }
}
