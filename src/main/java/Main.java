
import RestaurantMenu.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        CPPFoodDelivery cppFoodDelivery = new CPPFoodDelivery();

        Restaurant restaurantA = new Restaurant("Taco Bell", "456 King St", County.LA, "Mexican", 8, 21, cppFoodDelivery);
        Restaurant restaurantB = new Restaurant("Eataly","123 S Dr", County.ORANGE,"Italian",7,22,cppFoodDelivery);
        Restaurant restaurantC = new Restaurant("Thai Thyme", "360 X St",County.SAN_BERNARDINO,"Thai",8,23,cppFoodDelivery);
        Restaurant restaurantD = new Restaurant("Taco Bout It","2020 Max Ave",County.LA,"Mexican",10,21,cppFoodDelivery);

        Customer jack = new Customer("Jack", "123 Jack's Street", County.LA, "no restriction", cppFoodDelivery);
        Customer zack = new Customer("Zack", "1100 N St",County.LA,"low carb",cppFoodDelivery);
        Customer gordon = new Customer("Gordon","25345 Colorado Blvd",County.LA,"low fat",cppFoodDelivery);
        Customer barry = new Customer("Barry","56 Allen Ave",County.ORANGE,"low fat",cppFoodDelivery);
        Customer carly = new Customer("Carly","987 Fairfax Dr",County.ORANGE,"low protein",cppFoodDelivery);
        Customer sam = new Customer("Sam","230 Snake St",County.ORANGE,"no restriction",cppFoodDelivery);
        Customer jackson = new Customer("Jackson","809 Plane Rd",County.SAN_BERNARDINO,"low carb",cppFoodDelivery);
        Customer ellie = new Customer("Ellie","2013 University Ave",County.SAN_BERNARDINO,"low fat",cppFoodDelivery);
        Customer joel = new Customer("Joel","4 Golf Dr",County.SAN_BERNARDINO,"low protein",cppFoodDelivery);
        Customer lara = new Customer("Lara","2000 Campus Ave",County.LA,"no restriction",cppFoodDelivery);

        Driver bob = new Driver("Bob", "789 Bob St", County.LA, OperationalTime.FIRST_SHIFT);
        Driver dylan = new Driver("Dylan","234 D Blvd",County.ORANGE, OperationalTime.FIRST_SHIFT);
        Driver wanda = new Driver("Wanda","2789 Cosmo Blvd",County.SAN_BERNARDINO,OperationalTime.FIRST_SHIFT);
        Driver timmy = new Driver("Timmy","3234 Turner Ave",County.LA,OperationalTime.SECOND_SHIFT);
        Driver wally = new Driver("Wally","59 West Ave",County.ORANGE,OperationalTime.SECOND_SHIFT);
        Driver melissa = new Driver("Melissa","5686 Sierra St",County.SAN_BERNARDINO,OperationalTime.SECOND_SHIFT);
        Driver alyssa = new Driver("Alyssa","8492 California Ave",County.LA,OperationalTime.THIRD_SHIFT);
        Driver chris = new Driver("Chris", "3414 Stewart Ave", County.ORANGE, OperationalTime.THIRD_SHIFT);

        cppFoodDelivery.registerCustomer(jack);
        cppFoodDelivery.registerCustomer(zack);
        cppFoodDelivery.registerCustomer(gordon);
        cppFoodDelivery.registerCustomer(barry);
        cppFoodDelivery.registerCustomer(carly);
        cppFoodDelivery.registerCustomer(sam);
        cppFoodDelivery.registerCustomer(jackson);
        cppFoodDelivery.registerCustomer(ellie);
        cppFoodDelivery.registerCustomer(joel);
        cppFoodDelivery.registerCustomer(lara);

        cppFoodDelivery.registerRestaurant(restaurantA);
        cppFoodDelivery.registerRestaurant(restaurantB);
        cppFoodDelivery.registerRestaurant(restaurantC);
        cppFoodDelivery.registerRestaurant(restaurantD);

        cppFoodDelivery.registerDriver(bob);
        cppFoodDelivery.registerDriver(dylan);
        cppFoodDelivery.registerDriver(wanda);
        cppFoodDelivery.registerDriver(timmy);
        cppFoodDelivery.registerDriver(wally);
        cppFoodDelivery.registerDriver(melissa);
        cppFoodDelivery.registerDriver(alyssa);
        cppFoodDelivery.registerDriver(chris);

        List<Meal> jackMealList = new ArrayList<>();
        jackMealList.add(new Cheese(new GrilledChicken()));
        Order jackOrder = new Order(jack, restaurantA, jackMealList);
        jack.placeOrder(jackOrder, LocalTime.of(10,0));

        List<Meal> zackMealList = CuisineManager.getMeals("Italian");
        Order zackOrder = new Order(zack, restaurantB, zackMealList);
        zack.placeOrder(zackOrder, LocalTime.of(14,0));

        List<Meal> gordonMealList = CuisineManager.getMeals("Thai");
        Order gordonOrder = new Order(gordon, restaurantC, gordonMealList);
        gordon.placeOrder(gordonOrder, LocalTime.of(18,0));

        List<Meal> jacksonMealList = new ArrayList<>();
        jacksonMealList.add(new AvocadoSalad());
        jacksonMealList.add(new Cheese(new CornTortilla()));
        Order jacksonOrder = new Order(jackson, restaurantA, jacksonMealList);
        jackson.placeOrder(jacksonOrder, LocalTime.of(10,0));


        List<Meal> samMealList = new ArrayList<>();
        samMealList.add(new FattyCoconutMilk());
        samMealList.add(new StickyRice());
        Order samOrder = new Order(sam, restaurantC, samMealList);
        sam.placeOrder(samOrder, LocalTime.of(10,0));

        List<Meal> barryMealList = CuisineManager.getMeals("Mexican");
        Order barryOrder = new Order(barry, restaurantA, barryMealList);

        List<Meal> carlyMealList = CuisineManager.getMeals("Italian");
        Order carlyOrder = new Order(carly, restaurantB, carlyMealList);

        List<Meal> laraMealList = CuisineManager.getMeals("Thai");
        Order laraOrder = new Order(lara, restaurantC, laraMealList);

        barry.placeOrder(barryOrder, LocalTime.of(8,0));
        carly.placeOrder(carlyOrder, LocalTime.of(11, 0));
        lara.placeOrder(laraOrder, LocalTime.of(23,0));

        List<Meal> ellieMealList = CuisineManager.getMeals("Thai");
        Order ellieOrder = new Order(ellie, restaurantC, ellieMealList);
        ellie.placeOrder(ellieOrder, LocalTime.of(20,0));

        List<Meal> joelMealList = CuisineManager.getMeals("Thai");
        Order joelOrder = new Order(joel, restaurantC, joelMealList);
        joel.placeOrder(joelOrder, LocalTime.of(19,0));



    }
}