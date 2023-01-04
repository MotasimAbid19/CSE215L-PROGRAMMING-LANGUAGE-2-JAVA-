public class Lab4 {
    public static void main(String[] args) {
        double distance = 14;
        double newDistance = (distance / 1.6);

        double time = 45 * 60 + 30;

        double hour = time / 3600;

        double AverageSpeedInMilesHour = newDistance / hour;

        System.out.println("the average speed in miles per hour " + AverageSpeedInMilesHour);
    }
}
