package RestaurantMenu;

public class Avocado extends MealDecorator {
    public Avocado(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    String getToppingDescription() {
        return "with RestaurantMenu.Avocado";
    }
}
