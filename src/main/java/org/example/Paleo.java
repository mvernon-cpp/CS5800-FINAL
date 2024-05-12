package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class Paleo extends Macronutrient {
    @Override
    ArrayList<String> setRestriction()
    {
        ArrayList<String> paleoRestrictions = new ArrayList<>();

        String[] carbs={"Pistachio"};
        String[] proteins = {"Fish", "Chicken", "Beef"};
        String[] fats = {"Avocado", "Tuna", "Peanuts"};

        Collections.addAll(paleoRestrictions, carbs);
        Collections.addAll(paleoRestrictions, proteins);
        Collections.addAll(paleoRestrictions, fats);

//        System.out.print("The paleo diet includes: ");
//        System.out.print(paleoRestrictions);
//        System.out.println("\n-------------------");

        return paleoRestrictions;
    }
}
