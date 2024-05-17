package RestaurantMenu;

public class StickyRice implements Meal {
    boolean low_carb = false;
    @Override
    public String getDescription() {
        return "Sticky Rice";
    }

    public void setDietaryAlternative(){
        this.low_carb = true;
    }
}
