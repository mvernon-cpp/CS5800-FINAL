import java.time.LocalTime;
import java.util.Random;

// utility class to generate random minutes between order creation, pickup, and delivery time.

public class RandomTimeUtil {

    private static final int MAX_MINUTES = 60;
    private static final int MIN_MINUTES = 15;

    public static LocalTime addRandomMinutes(LocalTime time) {
        Random rand = new Random();
        int randMinute = rand.nextInt(MAX_MINUTES-MIN_MINUTES) + MIN_MINUTES;
        return time.plusMinutes(randMinute);
    }
}
