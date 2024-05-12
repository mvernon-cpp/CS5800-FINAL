package org.example;

public class Beef extends Protein{
    @Override
    public void addMacronutrient(){ System.out.println("Adding beef.."); }

    Beef(){
        addProtein();
        addMacronutrient();
    }
    public void printMacronutrient(){
        printProtein();
        System.out.print("Beef ");
    }
}
