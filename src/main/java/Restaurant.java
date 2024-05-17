import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Queue;

public class Restaurant {
    private final String name;
    private final String address;
    private final County county;
    private final String cuisine;
    private final OperationalTime operationalTime;
    private final CPPFoodDelivery cppFoodDelivery;
    private Queue<Order> orders = new LinkedList<>();

    public Restaurant(String name, String address, County county, String cuisine, int openHour, int closeHour, CPPFoodDelivery cppFoodDelivery) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.cuisine = cuisine;
        this.operationalTime = new OperationalTime(openHour, closeHour);
        this.cppFoodDelivery = cppFoodDelivery;
    }

    public void receiveOrder(Order order) {
        orders.add(order);
    }

    public void processAnOrder() {
        if(orders.isEmpty()) {
            System.out.println(name + " has no ongoing orders");
            return;
        }
        Order currentOrder = orders.remove();
        // manipulate macros
        System.out.println("Processing an order for " + currentOrder.getCustomer().getName());
        cppFoodDelivery.sendPickupOrder(this, currentOrder);
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
