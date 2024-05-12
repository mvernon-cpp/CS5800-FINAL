package org.example;

public class Fish extends Protein{
    @Override
    public void addMacronutrient(){
        System.out.println("Adding fish to meal plan...");
    }

    Fish(){
        addProtein();
        addMacronutrient();
    }
    public void printMacronutrient(){
        printProtein();
        System.out.print("Fish ");
    }
}
