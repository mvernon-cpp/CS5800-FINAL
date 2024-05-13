package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Basic interface for a Meal
interface Meal {
    String getDescription();
    String getCategory();
}

// Abstract class for different types of meals
abstract class MealCategory implements Meal {
    protected String description;
    protected String category;

    public MealCategory(String description, String category) {
        this.description = description;
        this.category = category;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getCategory() {
        return category;
    }
}

// Specific classes for Fat, Carb, and Protein meals
class FatMeal extends MealCategory {
    public FatMeal(String description) {
        super(description, "Fat");
    }
}

class CarbMeal extends MealCategory {
    public CarbMeal(String description) {
        super(description, "Carb");
    }
}

class ProteinMeal extends MealCategory {
    public ProteinMeal(String description) {
        super(description, "Protein");
    }
}

// Abstract decorator class for Meal Toppings
abstract class MealDecorator implements Meal {
    protected Meal decoratedMeal;

    public MealDecorator(Meal decoratedMeal) {
        this.decoratedMeal = decoratedMeal;
    }

    @Override
    public String getDescription() {
        return decoratedMeal.getDescription() + ", " + getToppingDescription();
    }

    @Override
    public String getCategory() {
        return decoratedMeal.getCategory();
    }

    abstract String getToppingDescription();
}

// Concrete decorator classes for specific toppings
class Cheese extends MealDecorator {
    public Cheese(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    String getToppingDescription() {
        return "with Cheese";
    }
}

class Avocado extends MealDecorator {
    public Avocado(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    String getToppingDescription() {
        return "with Avocado";
    }
}

class Bacon extends MealDecorator {
    public Bacon(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    String getToppingDescription() {
        return "with Bacon";
    }
}

// Cuisine manager to handle meal creation and restriction
class CuisineManager {
    public static List<Meal> getMeals(String cuisineType) {
        List<Meal> meals = new ArrayList<>();
        switch (cuisineType) {
            case "Thai":
                meals.add(new FatMeal("Fatty Coconut Milk"));
                meals.add(new CarbMeal("Sticky Rice"));
                meals.add(new ProteinMeal("Grilled Chicken"));
                break;
            case "Mexican":
                meals.add(new FatMeal("Avocado Salad"));
                meals.add(new CarbMeal("Corn Tortilla"));
                meals.add(new ProteinMeal("Beef Tacos"));
                break;
            case "Italian":
                meals.add(new FatMeal("Olive Oil Drizzle"));
                meals.add(new CarbMeal("Pasta Aglio e Olio"));
                meals.add(new ProteinMeal("Grilled Fish"));
                break;
        }
        return meals;
    }
}

// Class to randomly select a meal considering dietary restrictions
public class RestaurantMenu {
    public static void main(String[] args) {
        String dietaryRestriction = "Carb"; // Example restriction

        List<Meal> availableMeals = CuisineManager.getMeals("Italian");
        availableMeals.removeIf(meal -> meal.getCategory().equals(dietaryRestriction)); // Filter out restricted meal

        Random random = new Random();
        Meal selectedMeal = availableMeals.get(random.nextInt(availableMeals.size()));

        // Adding toppings
        Meal mealWithCheese = new Cheese(selectedMeal);
        Meal mealWithAvocado = new Avocado(mealWithCheese); // Multiple toppings

        System.out.println("Selected Meal: " + mealWithAvocado.getCategory() + " - " + mealWithAvocado.getDescription());
    }
}
