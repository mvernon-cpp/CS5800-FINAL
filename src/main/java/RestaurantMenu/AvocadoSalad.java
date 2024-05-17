package RestaurantMenu;

// Individual meal classes for Mexican cuisine
public class AvocadoSalad implements Meal {

    boolean low_fat = false;
    @Override
    public String getDescription() {
        return "Avocado Salad";
    }

    public void setDietaryAlternative(){
        this.low_fat = true;
    }
}
