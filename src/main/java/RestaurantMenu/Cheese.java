package RestaurantMenu;

// Concrete decorator classes for specific toppings
public class Cheese extends MealDecorator {
    public Cheese(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    String getToppingDescription() {
        return "with RestaurantMenu.Cheese";
    }
}
