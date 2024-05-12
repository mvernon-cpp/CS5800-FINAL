package org.example;

import java.util.ArrayList;

public class Customer {

    private String name;
    private String address;
    private String county;
    private ArrayList<String> dietaryRestrictions;

    public Customer(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.dietaryRestrictions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCounty() {
        return county;
    }

    public ArrayList<String> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setDietaryRestrictions(String dietRestrictionType) {
        MacronutrientFactory m = MacronutrientFactory.getInstance();
        Macronutrient restriction = m.getMacronutrients(dietRestrictionType);
        dietaryRestrictions = restriction.setRestriction();
    }

    @Override
    public String toString()
    {
        String tempStr = "Customer Information: " + name + "\n" + address + "\n" + county + "\nDietary restrictions: [ ";
        for (String foodItem : dietaryRestrictions)
        {
            tempStr = tempStr + foodItem + " ";
        }
        tempStr = tempStr + "]";
        return tempStr;
    }
}
