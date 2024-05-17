package Macronutrient;

public class MacronutrientFactory {
    private static MacronutrientFactory macronutrientFactory = null;

    private MacronutrientFactory(){}

    public static MacronutrientFactory getInstance(){
        if(macronutrientFactory == null)
            macronutrientFactory = new MacronutrientFactory();
        return macronutrientFactory;

    }

    public static Macronutrient getMacronutrients(String dietRestrction) {
        switch (dietRestrction){
            case "no restriction":
                return new NoRestriction();
            case "low carb":
                return new LowCarb();
            case "low fat":
                return new LowFat();
            case "low protein":
                return new LowProtein();
            default:
                return null;
        }
    }
}
