import java.util.ArrayList;
import java.util.List;

class Food {}

public class Order {
    private List<Food> foodList = new ArrayList<>();
    private final Customer customer;
    private final Restaurant restaurant;

    public Order(Customer customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
    }

    public void addFoodToOrder(Food food) {
        foodList.add(food);
    }


}
