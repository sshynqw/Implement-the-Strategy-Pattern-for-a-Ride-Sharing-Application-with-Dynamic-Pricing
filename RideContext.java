package assignment4;

public class RideContext {
    private FareStrategy fareStrategy;

    public void setFareStrategy(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }

    public void selectStrategy(double distanceKm, double durationMin, boolean isPeakHour) {
        if (distanceKm < 0 || durationMin < 0) {
            throw new IllegalArgumentException("Distance and duration must be non-negative.");
        }
        if (isPeakHour) {
            setFareStrategy(new SurgeFareStrategy());
        } else if (distanceKm > 10) {
            setFareStrategy(new PremiumFareStrategy());
        } else if (distanceKm < 5) {
            setFareStrategy(new DiscountFareStrategy());
        } else {
            setFareStrategy(new RegularFareStrategy());
        }
    }

    public double calculateFare(double distanceKm, double durationMin) {
        if (fareStrategy == null) {
            throw new IllegalStateException("Fare strategy must be selected before calculating fare.");
        }
        double fare = fareStrategy.calculateFare(distanceKm, durationMin);
        return Math.max(fare, 5.00);
    }
}
