package RestaurantMenu;

// Individual meal classes for Thai cuisine
public class FattyCoconutMilk implements Meal {
    boolean low_fat = false;
    @Override
    public String getDescription() {
        return "Fatty Coconut Milk";
    }

    public void setDietaryAlternative(){
        this.low_fat = true;
    }
}
