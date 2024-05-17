import java.time.LocalTime;

public class Driver {

    private final String name;
    private final String address;
    private final County county;
    private final OperationalTime operationalTime;


    public Driver(String name, String address, County county, OperationalTime shift) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.operationalTime = shift;
    }

    public void deliverOrder(Order order) {
        order.setDriver(this);
        order.setOrderDeliveredTime(RandomTimeUtil.addRandomMinutes(order.getOrderPickupTime()));
        System.out.println(order);
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

    public boolean isWithinOperationalTime(LocalTime timeToCompare) {
        return operationalTime.isWithinOperationalTime(timeToCompare);
    }

    public String toString() {
        return "\nDriver: " + name +
                "\n\tAddress: " + address +
                "\n\tCounty: " + county;
    }
}
