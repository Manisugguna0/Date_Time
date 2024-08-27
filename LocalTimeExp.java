import java.time.LocalTime;

public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:
 public LocalTime addHoursToTime(LocalTime time, int hours) {
        return time.plusHours(hours);
    }
    public int compareTimes(LocalTime time1, LocalTime time2) 
    {
        if (time1.isBefore(time2)) {
            return -1;
        } else if (time1.equals(time2)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        LocalTimeExp timeExp = new LocalTimeExp();

        // Example usage of addHoursToTime
        LocalTime currentTime = LocalTime.of(15,00);
        LocalTime newTime = timeExp.addHoursToTime(currentTime, 5);
        System.out.println("Time after adding 5 hours: " + newTime);

        // Example usage of compareTimes
        LocalTime time1 = LocalTime.of(12, 0);
        LocalTime time2 = LocalTime.of(13, 0);
        int comparisonResult = timeExp.compareTimes(time1, time2);
        System.out.println("Comparison result: " + comparisonResult);
    }
}
