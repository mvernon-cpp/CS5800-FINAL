package org.example;

public class Avocado extends Fats{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding avocado to meal...");
    }

    Avocado(){
        addFats();
        addMacronutrient();
    }

    public void printMacronutrient(){
        printFats();
        System.out.print("Avocado ");
    }
}
