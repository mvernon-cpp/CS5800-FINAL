package RestaurantMenu;

// Individual meal classes for Italian cuisine
public class OliveOilDrizzle implements Meal {
    boolean low_fat = false;
    @Override
    public String getDescription() {
        return "Olive Oil Drizzle";
    }

    public void setDietaryAlternative(){
        this.low_fat = true;
    }
}
