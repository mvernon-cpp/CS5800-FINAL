import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CPPFoodDelivery {

    private List<Customer> registeredCustomers = new ArrayList<>();
    private List<Restaurant> registeredRestaurants = new ArrayList<>();
    private HashMap<County, List<Driver>> registeredDrivers = new HashMap<>();

    public void registerRestaurant(Restaurant restaurant) {
        registeredRestaurants.add(restaurant);
    }

    public void registerCustomer(Customer customer) {
        registeredCustomers.add(customer);
    }

    public void registerDriver(Driver driver) {
        County driverCounty = driver.getCounty();
        registeredDrivers.putIfAbsent(driverCounty, new ArrayList<>());
        registeredDrivers.get(driverCounty).add(driver);
    }

    public void placeOrder(Customer customer, Order order, LocalTime orderTime) {
        Restaurant restaurant = order.getRestaurant();
        if(registeredCustomers.contains(customer) && registeredRestaurants.contains(restaurant)) {
            order.setOrderCreationTime(orderTime);
            if(restaurant.isWithinOperationalTime(orderTime) && restaurant.isInTheSameCounty(customer.getCounty())) {
                restaurant.receiveOrder(order);
                System.out.println("Order is received by the restaurant");
            }
        }
    }

    public void sendPickupOrder(Restaurant restaurant, Order order) {
        System.out.println("Pick up order is sent from " + restaurant.getName() + ", looking for available driver...");
        List<Driver> driversInSameCounty = registeredDrivers.get(restaurant.getCounty());
        for(Driver driver : driversInSameCounty) {
            if(driver.isWithinOperationalTime(order.getOrderCreationTime()) && driver.isAvailable()) {
                System.out.println("Driver " + driver.getName() + " is picking up the order");
                driver.pickUpOrder(order);
                return;
            }
        }
        System.out.println("No available drivers");
    }

}
