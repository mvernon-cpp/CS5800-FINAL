package RestaurantMenu;

public class GrilledFish implements Meal {
    boolean low_protein = false;
    @Override
    public String getDescription() {
        return "Grilled Fish";
    }

    public void setDietaryAlternative(){
        this.low_protein = true;
    }
}
