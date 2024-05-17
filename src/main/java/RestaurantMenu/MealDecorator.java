package RestaurantMenu;

// Abstract decorator class for RestaurantMenu.Meal Toppings
public abstract class MealDecorator implements Meal {
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
