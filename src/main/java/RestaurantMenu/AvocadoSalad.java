package RestaurantMenu;

// Individual meal classes for Mexican cuisine
public class AvocadoSalad implements Meal {
    private String macro = "fat";
    boolean low_fat = false;
    @Override
    public String getDescription() {
        return "Avocado Salad";
    }

    public void setDietaryAlternative(){
        this.low_fat = true;
        macro = "low " + macro;
    }

    @Override
    public String getMacro() {
        return macro;
    }
}
