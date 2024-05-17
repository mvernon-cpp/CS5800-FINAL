package RestaurantMenu;

public class Bacon extends MealDecorator {
    public Bacon(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    String getToppingDescription() {
        return "with RestaurantMenu.Bacon";
    }

    public void setDietaryAlternative() {

    }
}
