package org.example;

import java.util.ArrayList;
public class Diet {
    ArrayList<String> carbs;
    ArrayList<String> protein;
    ArrayList<String> fats;

    String diet_type;

    public String getDiet_type(){
        return this.diet_type;
    }

    Diet(String diet_type) {
        this.diet_type = diet_type;
        this.carbs = new ArrayList<String>();
        this.protein = new ArrayList<String>();
        this.fats = new ArrayList<String>();
        switch (diet_type) {
            case "No Restriction": {
                this.carbs.add("cheese");
                this.carbs.add("bread");
                this.carbs.add("lentils");
                this.carbs.add("pistachio");

                this.protein.add("fish");
                this.protein.add("chicken");
                this.protein.add("beef");
                this.protein.add("tofu");

                this.fats.add("avocado");
                this.fats.add("sour cream");
                this.fats.add("tuna");
                this.fats.add("peanuts");

                break;
            }

            case "Paleo": {
                this.carbs.add("pistachio");

                this.protein.add("fish");
                this.protein.add("chicken");
                this.protein.add("beef");

                this.fats.add("avocado");
                this.fats.add("tuna");
                this.fats.add("peanuts");

                break;
            }
            case "Vegan": {
                this.carbs.add("bread");
                this.carbs.add("lentils");
                this.carbs.add("pistachio");

                this.protein.add("tofu");

                this.fats.add("avocado");
                this.fats.add("peanuts");

                break;
            }
            case "Nut Allergy": {
                this.carbs.add("cheese");
                this.carbs.add("bread");
                this.carbs.add("lentils");

                this.protein.add("fish");
                this.protein.add("chicken");
                this.protein.add("beef");
                this.protein.add("tofu");

                this.fats.add("avocado");
                this.fats.add("sour cream");
                this.fats.add("tuna");

                break;

            }
        }
    }

}
