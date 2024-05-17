import Macronutrient.MacronutrientFactory;
import RestaurantMenu.Meal;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final String name;
    private final String address;
    private final County county;
    private final String cuisine;
    private final OperationalTime operationalTime;
    private final CPPFoodDelivery cppFoodDelivery;
    private MacronutrientFactory macronutrientFactory;

    public Restaurant(String name, String address, County county, String cuisine, int openHour, int closeHour, CPPFoodDelivery cppFoodDelivery) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.cuisine = cuisine;
        this.operationalTime = new OperationalTime(openHour, closeHour);
        this.cppFoodDelivery = cppFoodDelivery;
        this.macronutrientFactory = MacronutrientFactory.getInstance();
    }

    public void receiveOrder(Order order) {
        List<Meal> mealList = order.getMealList();
        for(Meal meal : mealList) {
            // alter macros
            ArrayList<String> restriction_list = this.macronutrientFactory.getMacronutrients(order.getCustomer().getDietaryRestriction()).setRestriction();
            if(restriction_list.contains(meal.getDescription())){
                meal.setDietaryAlternative();
            }

        }
        order.setOrderPickupTime(RandomTimeUtil.addRandomMinutes(order.getOrderCreationTime()));
        cppFoodDelivery.pickUpOrder(this, order);
    }

    public boolean isWithinOperationalTime(LocalTime timeToCompare) {
        return operationalTime.isWithinOperationalTime(timeToCompare);
    }

    public boolean isInTheSameCounty(County countyToCompare) {
        return county.isInTheSameCounty(countyToCompare);
    }

    public County getCounty() {
        return county;
    }

    public String getCuisine() {
        return cuisine;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public OperationalTime getOperationalTime() {
        return operationalTime;
    }

    @Override
    public String toString() {
        return "\nRestaurant: " + name +
                "\n\tAddress: " + address +
                "\n\tCounty: " + county +
                "\n\tOperating Hours: " + operationalTime.toString() +
                "\n\tCuisine: " + cuisine;
    }
}
