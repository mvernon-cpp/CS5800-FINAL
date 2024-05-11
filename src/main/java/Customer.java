public class Customer {

    private final String name;
    private final String address;
    private final String county;
    private final Diet

    public Customer(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
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
