package Macronutrient;

import java.util.ArrayList;
import java.util.Collections;

public class LowFat extends Macronutrient{
    @Override
    public ArrayList<String> setRestriction() {
        ArrayList<String> lowFat = new ArrayList<>();

        String[] fats = {"Fatty Coconut Milk", "Avocado Salad", "Olive Oil Drizzle"};

        Collections.addAll(lowFat, fats);

        return lowFat;
    }
}