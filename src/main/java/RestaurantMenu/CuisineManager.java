package RestaurantMenu;

import java.util.ArrayList;
import java.util.List;

// Cuisine manager to handle meal creation
public class CuisineManager {
    public static List<Meal> getMeals(String cuisineType) {
        List<Meal> meals = new ArrayList<>();
        switch (cuisineType) {
            case "Thai":
                meals.add(new FattyCoconutMilk());
                meals.add(new StickyRice());
                meals.add(new GrilledChicken());
                break;
            case "Mexican":
                meals.add(new AvocadoSalad());
                meals.add(new CornTortilla());
                meals.add(new BeefTacos());
                break;
            case "Italian":
                meals.add(new OliveOilDrizzle());
                meals.add(new PastaAglioEOlio());
                meals.add(new GrilledFish());
                break;
        }
        return meals;
    }
}
