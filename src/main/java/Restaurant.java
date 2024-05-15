public class Restaurant {
    private final String name;
    private final String address;
    private final String operatingHours;
    private final RestaurantMediator restaurantMediator;

    public Restaurant(String name, String address, String operatingHours, RestaurantMediator restaurantMediator) {
        this.name = name;
        this.address = address;
        this.operatingHours = operatingHours;
        this.restaurantMediator = restaurantMediator;
    }

    public void pickupOrder(Driver driver, Order order) {
        restaurantMediator.pickupOrder(this, driver, order);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getOperatingHours() {
        return operatingHours;
    }
}
