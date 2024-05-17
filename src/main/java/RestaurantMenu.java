import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Basic interface for a Meal
interface Meal {
    String getDescription();
}

// Individual meal classes for Thai cuisine
class FattyCoconutMilk implements Meal {
    @Override
    public String getDescription() {
        return "Fatty Coconut Milk";
    }
}

class StickyRice implements Meal {
    @Override
    public String getDescription() {
        return "Sticky Rice";
    }
}

class GrilledChicken implements Meal {
    @Override
    public String getDescription() {
        return "Grilled Chicken";
    }
}

// Individual meal classes for Mexican cuisine
class AvocadoSalad implements Meal {
    @Override
    public String getDescription() {
        return "Avocado Salad";
    }
}

class CornTortilla implements Meal {
    @Override
    public String getDescription() {
        return "Corn Tortilla";
    }
}

class BeefTacos implements Meal {
    @Override
    public String getDescription() {
        return "Beef Tacos";
    }
}

// Individual meal classes for Italian cuisine
class OliveOilDrizzle implements Meal {
    @Override
    public String getDescription() {
        return "Olive Oil Drizzle";
    }
}

class PastaAglioEOlio implements Meal {
    @Override
    public String getDescription() {
        return "Pasta Aglio e Olio";
    }
}

class GrilledFish implements Meal {
    @Override
    public String getDescription() {
        return "Grilled Fish";
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

// Cuisine manager to handle meal creation
class CuisineManager {
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

// Class to randomly select a meal
public class RestaurantMenu {
    public static void main(String[] args) {
        List<Meal> availableMeals = CuisineManager.getMeals("Italian");

        Random random = new Random();
        Meal selectedMeal = availableMeals.get(random.nextInt(availableMeals.size()));

        // Adding toppings
        Meal mealWithCheese = new Cheese(selectedMeal);
        Meal mealWithAvocado = new Avocado(mealWithCheese); // Multiple toppings

        System.out.println("Selected Meal: " + mealWithAvocado.getDescription());
    }
}
