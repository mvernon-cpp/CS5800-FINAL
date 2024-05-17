
import RestaurantMenu.Cheese;
import RestaurantMenu.GrilledChicken;
import RestaurantMenu.Meal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        CPPFoodDelivery cppFoodDelivery = new CPPFoodDelivery();

        Restaurant thaiCafeLA = new Restaurant("Thai Cafe", "456 King St", County.LA, "Thai", 8, 21, cppFoodDelivery);
        Restaurant tacoBellLA = new Restaurant("Taco Bell", "112 Spicy Ave", County.LA, "Mexican", 7, 22, cppFoodDelivery);
        Restaurant tacoBellOC = new Restaurant("Taco Bell", "007 Bond Ct", County.ORANGE, "Mexican", 9, 23, cppFoodDelivery);
        Restaurant oliveGardenSB = new Restaurant("Olive Garden", "1726 Grand Ave", County.SAN_BERNARDINO, "Italian", 10, 22, cppFoodDelivery);

        Customer jack = new Customer("Jack", "123 Jack St", County.LA, "No Restriction", cppFoodDelivery);
        Customer matthew = new Customer("Matthew", "79 Pena Rd", County.LA, "No Restriction", cppFoodDelivery);
        Customer marcia = new Customer("Marcia", "1244 Warren St", County.LA, "Low Protein", cppFoodDelivery);
        Customer ruth = new Customer("Ruth", "404 Bradley Ave", County.ORANGE, "Low Fat", cppFoodDelivery);
        Customer lynn = new Customer("Lynn","1239 Jordan St", County.ORANGE, "Low Carb", cppFoodDelivery);
        Customer stanley = new Customer("Stanley", "888 Lucky Rd", County.ORANGE, "No Restriction", cppFoodDelivery);
        Customer erica = new Customer("Erica", "7652 Smith Ave", County.ORANGE, "Low Fat", cppFoodDelivery);
        Customer philip = new Customer("Philip", "412 Bates Rd", County.SAN_BERNARDINO, "Low Protein", cppFoodDelivery);
        Customer ryan = new Customer("Ryan", "904 Maxwell St", County.SAN_BERNARDINO, "Low Carb", cppFoodDelivery);
        Customer debra = new Customer("Debra", "378 Baker St", County.SAN_BERNARDINO, "No Restriction", cppFoodDelivery);

        Driver bob = new Driver("Bob", "789 Bob St", County.LA, OperationalTime.FIRST_SHIFT);
        Driver samuel = new Driver("Samuel", "412 Brown Rd", County.LA, OperationalTime.SECOND_SHIFT);
        Driver janice = new Driver("Janice", "341 Lee Ave", County.LA, OperationalTime.THIRD_SHIFT);
        Driver sarah = new Driver("Sarah", "1323 Infinity Rd", County.ORANGE, OperationalTime.FIRST_SHIFT);
        Driver larry = new Driver("Larry", "232 Parker Ave", County.ORANGE, OperationalTime.SECOND_SHIFT);
        Driver denise = new Driver("Denise", "8125 Murphy Rd", County.ORANGE, OperationalTime.THIRD_SHIFT);
        Driver eugene = new Driver("Eugene", "999 Baker St", County.SAN_BERNARDINO, OperationalTime.FIRST_SHIFT);
        Driver chris = new Driver("Chris", "3414 Stewart Ave", County.SAN_BERNARDINO, OperationalTime.SECOND_SHIFT);

        cppFoodDelivery.registerRestaurant(thaiCafeLA);
        cppFoodDelivery.registerRestaurant(tacoBellLA);
        cppFoodDelivery.registerRestaurant(tacoBellOC);
        cppFoodDelivery.registerRestaurant(oliveGardenSB);

        cppFoodDelivery.registerCustomer(jack);
        cppFoodDelivery.registerCustomer(matthew);
        cppFoodDelivery.registerCustomer(marcia);
        cppFoodDelivery.registerCustomer(ruth);
        cppFoodDelivery.registerCustomer(lynn);
        cppFoodDelivery.registerCustomer(stanley);
        cppFoodDelivery.registerCustomer(erica);
        cppFoodDelivery.registerCustomer(philip);
        cppFoodDelivery.registerCustomer(ryan);
        cppFoodDelivery.registerCustomer(debra);

        cppFoodDelivery.registerDriver(bob);
        cppFoodDelivery.registerDriver(samuel);
        cppFoodDelivery.registerDriver(janice);
        cppFoodDelivery.registerDriver(sarah);
        cppFoodDelivery.registerDriver(larry);
        cppFoodDelivery.registerDriver(denise);
        cppFoodDelivery.registerDriver(eugene);
        cppFoodDelivery.registerDriver(chris);

        List<Meal> jackOrder = new ArrayList<>();
        jackOrder.add(new Cheese(new GrilledChicken()));

        Order newOrder = new Order(jack, thaiCafeLA, jackOrder);

        jack.placeOrder(newOrder, LocalTime.of(10,0));
    }
}