package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class NutAllergy extends Macronutrient {
    @Override
    ArrayList<String> setRestriction()
    {
        ArrayList<String> nutRestrictions = new ArrayList<>();

        String[] carbs={"Cheese", "Bread", "Lentils"};
        String[] proteins = {"Fish", "Chicken", "Beef", "Tofu"};
        String[] fats = {"Avocado", "Sour Cream", "Tuna"};

        Collections.addAll(nutRestrictions, carbs);
        Collections.addAll(nutRestrictions, proteins);
        Collections.addAll(nutRestrictions, fats);

//        System.out.print("The nut allergy diet includes: ");
//        System.out.print(nutRestrictions);
//        System.out.println("\n-------------------");

        return nutRestrictions;
    }
}
