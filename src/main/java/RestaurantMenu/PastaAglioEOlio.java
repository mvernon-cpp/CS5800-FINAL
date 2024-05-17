package RestaurantMenu;

public class PastaAglioEOlio implements Meal {
    boolean low_carb = false;
    @Override
    public String getDescription() {
        return "Pasta Aglio e Olio";
    }

    public void setDietaryAlternative(){
        this.low_carb = true;
    }
}
