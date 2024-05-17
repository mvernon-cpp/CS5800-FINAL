package org.example;

public abstract class Protein extends Macronutrient{
    public void addProtein(){
        System.out.println("Adding protein...");
    }

    public void printProtein(){
        System.out.print("Protein Macro: ");
    }
}

