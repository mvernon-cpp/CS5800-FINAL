package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class NoRestriction extends Macronutrient {
    @Override
    ArrayList<String> setRestriction()
    {
        ArrayList<String> noDietaryRestrictions = new ArrayList<>();

        String[] carbs={""};
        String[] proteins = {""};
        String[] fats = {""};

        Collections.addAll(noDietaryRestrictions, carbs);
        Collections.addAll(noDietaryRestrictions, proteins);
        Collections.addAll(noDietaryRestrictions, fats);

        return noDietaryRestrictions;
    }
}
