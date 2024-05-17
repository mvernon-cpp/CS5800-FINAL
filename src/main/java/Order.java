import RestaurantMenu.Meal;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Meal> mealList;
    private final Customer customer;
    private final Restaurant restaurant;
    private Driver driver;
    private LocalTime orderCreationTime;
    private LocalTime orderPickupTime;
    private LocalTime orderDeliveredTime;


    public Order(Customer customer, Restaurant restaurant, List<Meal> foodList) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.mealList = foodList;
    }

    public void setOrderCreationTime(LocalTime time) {
        this.orderCreationTime = time;
    }

    public void setOrderPickupTime(LocalTime time) {
        this.orderPickupTime = time;
    }

    public void setOrderDeliveredTime(LocalTime time) {
        this.orderDeliveredTime = time;
    }

    public List<Meal> getMealList() {
        return mealList;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public LocalTime getOrderCreationTime() {
        return orderCreationTime;
    }

    public LocalTime getOrderDeliveredTime() {
        return orderDeliveredTime;
    }

    public LocalTime getOrderPickupTime() {
        return orderPickupTime;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        StringBuilder foodTempStr = new StringBuilder();
        for(Meal meal : mealList) {
            foodTempStr.append("\t" + meal.getDescription()).append(" (" + meal.getMacro() + ")" + "\n");
        }

        String orderDetails = customer.toString() + restaurant.toString() + driver.toString() +
                "\nFood List: \n" + foodTempStr +
                "\nOrder creation: " + orderCreationTime.toString() +
                "\nOrder picked up: " + orderPickupTime.toString() +
                "\nOrder delivered: " + orderDeliveredTime.toString() + "\n";
        return orderDetails;
    }
}
