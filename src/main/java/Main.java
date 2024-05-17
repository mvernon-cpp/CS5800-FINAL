import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CPPFoodDelivery cppFoodDelivery = new CPPFoodDelivery();

        Restaurant restaurantA = new Restaurant("Burger King", "456 King St", County.LA, "Western", 8, 21, cppFoodDelivery);
        Customer jack = new Customer("Jack", "123 Jack's Street", County.LA, "VEGAN", cppFoodDelivery);
        Driver bob = new Driver("Bob", "789 Bob St", County.LA, OperationalTime.FIRST_SHIFT);

        cppFoodDelivery.registerCustomer(jack);
        cppFoodDelivery.registerRestaurant(restaurantA);
        cppFoodDelivery.registerDriver(bob);

        Order newOrder = new Order(jack, restaurantA, List.of(new Food("Burger")));

        jack.placeOrder(newOrder, LocalTime.of(10,0));
    }
}