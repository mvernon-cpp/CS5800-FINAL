package RestaurantMenu;

public class CornTortilla implements Meal {
    boolean low_carb = false;
    @Override
    public String getDescription() {
        return "Corn Tortilla";
    }

    public void setDietaryAlternative(){
        this.low_carb = true;
    }
}
