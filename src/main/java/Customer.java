import java.time.LocalTime;

public class Customer {

    private String name;
    private String address;
    private County county;
    private String dietaryRestriction;
    private CPPFoodDelivery cppFoodDelivery;

    public Customer(String name, String address, County county, String dietaryRestriction, CPPFoodDelivery cppFoodDelivery) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.dietaryRestriction = dietaryRestriction;
        this.cppFoodDelivery = cppFoodDelivery;
    }

    public void placeOrder(Order order, LocalTime orderTime) {
        cppFoodDelivery.placeOrder(this, order, orderTime);
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

    public String getDietaryRestriction() {
        return dietaryRestriction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCounty(County county) {
        this.county = county;
    }
    public void setDietaryRestriction(String dietaryRestriction) {
        this.dietaryRestriction = dietaryRestriction;
    }

    @Override
    public String toString()
    {
        return "Customer: " + name +
                "\n\tAddress: " + address +
                "\n\tCounty: " + county +
                "\n\tDietary Restriction: " + dietaryRestriction;
    }
}