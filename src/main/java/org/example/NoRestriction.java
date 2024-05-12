package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class NoRestriction extends Macronutrient {
    @Override
    ArrayList<String> setRestriction()
    {
        ArrayList<String> noDietaryRestrictions = new ArrayList<>();

        String[] carbs={"Cheese", "Bread", "Lentils", "Pistachio"};
        String[] proteins = {"Fish", "Chicken", "Beef", "Tofu"};
        String[] fats = {"Avocado", "Sour Cream", "Tuna", "Peanuts"};

        Collections.addAll(noDietaryRestrictions, carbs);
        Collections.addAll(noDietaryRestrictions, proteins);
        Collections.addAll(noDietaryRestrictions, fats);

        System.out.print("The no restriction diet includes: ");
        System.out.print(noDietaryRestrictions);
        System.out.println("\n-------------------");

        return noDietaryRestrictions;
    }
}
