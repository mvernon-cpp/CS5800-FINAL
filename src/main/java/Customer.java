public class Customer {

    private final String name;
    private final String address;
    private final String county;
    private final String diet;

    public Customer(String name, String address, String county, String diet) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.diet = diet;
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
