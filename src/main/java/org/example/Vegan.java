package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class Vegan extends Macronutrient {
    @Override
    ArrayList<String> setRestriction()
    {
        ArrayList<String> veganRestrictions = new ArrayList<>();

        String[] carbs={"Bread", "Lentils", "Pistachio"};
        String[] proteins = {"Tofu"};
        String[] fats = {"Avocado", "Peanuts"};

        Collections.addAll(veganRestrictions, carbs);
        Collections.addAll(veganRestrictions, proteins);
        Collections.addAll(veganRestrictions, fats);

//        System.out.print("The vegan diet includes: ");
//        System.out.print(veganRestrictions);
//        System.out.println("\n-------------------");

        return veganRestrictions;
    }
}
