import java.util.Objects;

public enum County {
    LA("Los Angeles County"),
    ORANGE("Orange County"),
    SAN_BERNARDINO("San Benardino County");

    private final String name;

    County(String name) {
        this.name = name;
    }

    public boolean isInTheSameCounty(County county) {
        return (Objects.equals(this.name, county.getName()));
    }

    public String getName() {
        return name;
    }
}
