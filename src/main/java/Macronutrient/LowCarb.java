package Macronutrient;

import java.util.ArrayList;
import java.util.Collections;

public class LowCarb extends Macronutrient{

    @Override
    public ArrayList<String> setRestriction() {
        ArrayList<String> lowCarb = new ArrayList<>();

        String[] carbs={"Sticky Rice", "Corn Tortilla", "Pasta Aglio e Olio"};
        Collections.addAll(lowCarb, carbs);

        return lowCarb;
    }
}