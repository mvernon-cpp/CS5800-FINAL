package RestaurantMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Class to randomly select a meal
public class RestaurantMenu {
    public static void main(String[] args) {
        List<Meal> availableMeals = CuisineManager.getMeals("Italian");

        Random random = new Random();
        Meal selectedMeal = availableMeals.get(random.nextInt(availableMeals.size()));

        // Adding toppings
        Meal mealWithCheese = new Cheese(selectedMeal);
        Meal mealWithAvocado = new Avocado(mealWithCheese); // Multiple toppings

        System.out.println("Selected RestaurantMenu.Meal: " + mealWithAvocado.getDescription());
    }
}
