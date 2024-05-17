package RestaurantMenu;

public class BeefTacos implements Meal {
    boolean low_protein = false;
    @Override
    public String getDescription() {
        return "Beef Tacos";
    }

    public void setDietaryAlternative(){
        this.low_protein = true;
    }
}
