public class Restaurant {
    private final String name;
    private final String address;
    private final String operatingHours;

    public Restaurant(String name, String address, String operatingHours) {
        this.name = name;
        this.address = address;
        this.operatingHours = operatingHours;
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
