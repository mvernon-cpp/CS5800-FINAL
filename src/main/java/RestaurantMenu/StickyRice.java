package RestaurantMenu;

public class StickyRice implements Meal {
    private String macro = "carb";
    boolean low_carb = false;
    @Override
    public String getDescription() {
        return "Sticky Rice";
    }

    public void setDietaryAlternative(){
        this.low_carb = true;
        macro = "low " + macro;
    }

    @Override
    public String getMacro() {
        return macro;
    }
}
