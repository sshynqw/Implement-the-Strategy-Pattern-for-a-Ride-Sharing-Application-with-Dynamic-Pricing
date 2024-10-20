package assignment4;

public class PremiumFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distanceKm, double durationMin) {
        return (distanceKm * 1.50) + (durationMin * 0.50);
    }
}