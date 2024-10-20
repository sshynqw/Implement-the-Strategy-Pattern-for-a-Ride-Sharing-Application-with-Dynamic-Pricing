package assignment4;

public class RegularFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distanceKm, double durationMin) {
        return (distanceKm * 1.00) + (durationMin * 0.25);
    }
}