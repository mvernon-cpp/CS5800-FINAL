package RestaurantMenu;

public class GrilledChicken implements Meal {
    private String macro = "protein";
    boolean low_protein = false;
    @Override
    public String getDescription() {
        return "Grilled Chicken";
    }

    public void setDietaryAlternative(){
        this.low_protein = true;
        macro = "low " + macro;
    }

    @Override
    public String getMacro() {
        return macro;
    }
}
