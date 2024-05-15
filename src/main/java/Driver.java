public class Driver {

    private final String name;
    private final String address;
    private final String county;
    private final ShiftHour shiftHour;
    private final RestaurantMediator restaurantMediator;

    public Driver(String name, String address, String county, ShiftHour shiftHour, RestaurantMediator restaurantMediator) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.shiftHour = shiftHour;
        this.restaurantMediator = restaurantMediator;
    }

    public void deliverOrder(Customer customer, Order order) {
        restaurantMediator.deliverOrder(this, customer, order);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCounty() {
        return county;
    }

    public ShiftHour getShiftHour() {
        return shiftHour;
    }
}
