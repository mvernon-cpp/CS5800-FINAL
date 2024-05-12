package org.example;

public class Meal {
    Macronutrient protein_portion;
    Macronutrient carb_portion;
    Macronutrient fat_portion;

    void prepareMeal(Protein_Factory proteinFactory,Carbs_Factory carbsFactory, Fats_Factory fatsFactory, Diet diet){
        setProtein_portion(proteinFactory.gatherMacronutrient(diet));
        setCarb_portion(carbsFactory.gatherMacronutrient(diet));
        setFat_portion(fatsFactory.gatherMacronutrient(diet));
    }

    public void setProtein_portion(Macronutrient protein_portion) {
        this.protein_portion = protein_portion;
    }

    public void setCarb_portion(Macronutrient carb_portion) {
        this.carb_portion = carb_portion;
    }

    public void setFat_portion(Macronutrient fat_portion) {
        this.fat_portion = fat_portion;
    }

    public Macronutrient getProtein_portion() {
        return protein_portion;
    }

    public Macronutrient getCarb_portion() {
        return carb_portion;
    }

    public Macronutrient getFat_portion() {
        return fat_portion;
    }
}
