package RestaurantMenu;

public class GrilledChicken implements Meal {
    boolean low_protein = false;
    @Override
    public String getDescription() {
        return "Grilled Chicken";
    }

    public void setDietaryAlternative(){
        this.low_protein = true;
    }
}
