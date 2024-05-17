package RestaurantMenu;

public class CornTortilla implements Meal {
    private String macro = "carb";

    boolean low_carb = false;
    @Override
    public String getDescription() {
        return "Corn Tortilla";
    }

    public void setDietaryAlternative(){
        this.low_carb = true;
    }

    @Override
    public String getMacro() {
        if(low_carb) {
            return "low carb";
        } else {
            return macro;
        }

    }
}
