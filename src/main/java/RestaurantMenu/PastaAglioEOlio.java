package RestaurantMenu;

public class PastaAglioEOlio implements Meal {
    private String macro = "carb";
    boolean low_carb = false;
    @Override
    public String getDescription() {
        return "Pasta Aglio e Olio";
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
