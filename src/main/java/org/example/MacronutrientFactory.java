package org.example;

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
            case "paleo":
                return new Paleo();
            case "vegan":
                return new Vegan();
            case "nut allergy":
                return new NutAllergy();
            default:
                return null;
        }
    }
}
