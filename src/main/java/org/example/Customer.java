package org.example;

import java.util.ArrayList;

public class Customer {

    private String name;
    private String address;
    private String county;
    private String dietaryRestriction;

    public Customer(String name, String address, String county, String dietaryRestriction) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.dietaryRestriction = dietaryRestriction;
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

    public String getDietaryRestriction() {
        return dietaryRestriction;
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
    public void setDietaryRestriction(String dietaryRestriction) {
        this.dietaryRestriction = dietaryRestriction;
    }

    @Override
    public String toString()
    {
        String tempStr = "Customer Information: " + name + "\n" + address + "\n" + county + "\nDietary restriction: " + dietaryRestriction;

        return tempStr;
    }
}
