// use military time format

import java.time.LocalDateTime;
import java.time.LocalTime;

public class OperationalTime {

    public static final OperationalTime FIRST_SHIFT = new OperationalTime(8, 16);
    public static final OperationalTime SECOND_SHIFT = new OperationalTime(16, 0);
    public static final OperationalTime THIRD_SHIFT = new OperationalTime(0, 8);

    private final LocalTime start;
    private final LocalTime end;

    public OperationalTime(int start, int end) {
        this.start = LocalTime.of(start, 0);
        this.end = LocalTime.of(end, 0);
    }

    public boolean isWithinOperationalTime(LocalTime timeToCompare) {
        return (timeToCompare.isAfter(start) && timeToCompare.isBefore(end));
    }

    @Override
    public String toString() {
        return "Open: " + start.toString() + ", Close: " + end.toString();
    }
}
