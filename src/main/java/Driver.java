public class Driver {

    private final String name;
    private final String address;
    private final String county;
    private final ShiftHour shiftHour;

    public Driver(String name, String address, String county, ShiftHour shiftHour) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.shiftHour = shiftHour;
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
