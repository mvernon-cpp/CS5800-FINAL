package Macronutrient;

import java.util.ArrayList;
import java.util.Collections;

public class LowProtein extends Macronutrient{

    @Override
    public ArrayList<String> setRestriction() {
        ArrayList<String> lowProtein = new ArrayList<>();

        String[] proteins = {"Grilled Chicken", "Beef Tacos", "Grilled Fish"};
        Collections.addAll(lowProtein, proteins);

        return lowProtein;
    }
}