public class Customer {

    private final String name;
    private final String address;
    private final String county;
    private final String diet;
    private final RestaurantMediator restaurantMediator;

    public Customer(String name, String address, String county, String diet, RestaurantMediator restaurantMediator) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.diet = diet;
        this.restaurantMediator = restaurantMediator;
    }

    public void placeOrder(Restaurant restaurant, Order order) {
        restaurantMediator.placeOrder(this, restaurant, order);
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
}
