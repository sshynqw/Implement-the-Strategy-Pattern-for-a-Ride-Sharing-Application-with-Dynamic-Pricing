package assignment4;

public class SurgeFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distanceKm, double durationMin) {
        return (distanceKm * 2.00) + (durationMin * 0.50);
    }
}