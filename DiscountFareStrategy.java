package assignment4;

public class DiscountFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distanceKm, double durationMin) {
        return (distanceKm * 0.80) + (durationMin * 0.20);
    }
}