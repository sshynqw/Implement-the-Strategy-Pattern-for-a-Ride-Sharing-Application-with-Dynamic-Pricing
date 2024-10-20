package assignment4;

public class RideTest {
    public static void main(String[] args) {
        RideContext ride = new RideContext();

        ride.selectStrategy(7, 15, false);
        System.out.println("Fare for regular ride: " + ride.calculateFare(7, 15));

        ride.selectStrategy(7, 15, true);
        System.out.println("Fare for surge ride: " + ride.calculateFare(7, 15));

        ride.selectStrategy(3, 10, false);
        System.out.println("Fare for discount ride: " + ride.calculateFare(3, 10));

        ride.selectStrategy(12, 20, false);
        System.out.println("Fare for premium ride: " + ride.calculateFare(12, 20));

        ride.selectStrategy(-5, 20, false);
        System.out.println("Negative ride: " + ride.calculateFare(-5, 20));
    }
}