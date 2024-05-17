import java.time.LocalTime;
import java.util.Random;

public class Driver {

    private final String name;
    private final String address;
    private final County county;
    private final OperationalTime operationalTime;
    private final CPPFoodDelivery CPPFoodDelivery;
    private Order currentOrder = null;

    private boolean isAvailable = true;

    public Driver(String name, String address, County county, OperationalTime shift, CPPFoodDelivery CPPFoodDelivery) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.operationalTime = shift;
        this.CPPFoodDelivery = CPPFoodDelivery;
    }

    public void pickUpOrder(Order order) {
        isAvailable = false;
        currentOrder = order;
        currentOrder.setDriver(this);
        currentOrder.setOrderPickupTime(addRandomDuration(currentOrder.getOrderCreationTime()));
    }

    public void deliverOrder() {
        if(currentOrder == null) {
            System.out.println(name + " has nothing to deliver");
            return;
        }
        currentOrder.setOrderDeliveredTime(addRandomDuration(currentOrder.getOrderPickupTime()));
        System.out.println(currentOrder.toString());
        isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public County getCounty() {
        return county;
    }

    public OperationalTime getShiftHour() {
        return operationalTime;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isWithinOperationalTime(LocalTime timeToCompare) {
        return operationalTime.isWithinOperationalTime(timeToCompare);
    }

    private LocalTime addRandomDuration(LocalTime time) {
        Random rand = new Random();
        int randMinute = rand.nextInt(60-15) + 15;
        return time.plusMinutes(randMinute);
    }

    public String toString() {
        return "\nDriver: " + name +
                "\n\tAddress: " + address +
                "\n\tCounty: " + county;
    }
}
