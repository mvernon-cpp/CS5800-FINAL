import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mediator {

    private HashMap<String, Customer> registeredCustomers = new HashMap<>();
    private HashMap<String, Restaurant> registeredRestaurants = new HashMap<>();
    private HashMap<ShiftHour, List<Driver>> registeredDrivers = new HashMap<>();

    public Mediator() {

    }

    public void registerRestaurant(Restaurant restaurant) {
        registeredRestaurants.putIfAbsent(restaurant.getName(), restaurant);
    }

    public void registerCustomer(Customer customer) {
        registeredCustomers.putIfAbsent(customer.getName(), customer);
    }

    public void registerDriver(Driver driver) {
        ShiftHour driverShiftHour = driver.getShiftHour();
        registeredDrivers.putIfAbsent(driverShiftHour, new ArrayList<>());
        registeredDrivers.get(driverShiftHour).add(driver);
    }

    public void placeOrder(Customer customer, Restaurant restaurant, Order order) {

    }

    public void pickupOrder(Driver driver, Order order) {

    }

}
