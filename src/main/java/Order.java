import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Food> foodList = new ArrayList<>();
    private final Customer customer;
    private final Restaurant restaurant;
    private Driver driver;
    private LocalTime orderCreationTime;
    private LocalTime orderPickupTime;
    private LocalTime orderDeliveredTime;


    public Order(Customer customer, Restaurant restaurant, List<Food> foodList) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.foodList = foodList;
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

    public List<Food> getFoodList() {
        return foodList;
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
        String orderDetails = customer.toString() + restaurant.toString() + driver.toString() +
                "\nOrder creation: " + orderCreationTime.toString() +
                "\nOrder picked up: " + orderPickupTime.toString() +
                "\nOrder delivered: " + orderDeliveredTime.toString();
        return orderDetails;
    }
}
