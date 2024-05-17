package org.example;

public class Customer {

    private final String name;
    private final String address;
    private final String county;
    private final Diet diet;
    private Meal meal;

    public Customer(String name, String address, String county, String diet_plan) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.diet = new Diet(diet_plan);
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCounty() {
        return this.county;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    Diet getDiet(){
        return this.diet;
    }
}