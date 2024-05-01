package com.assignment.question;

public class SurgeBased implements PricingStrategy{
    private static final double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier

    @Override
    public PricingType supportsType() {
        return PricingType.SURGE;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE * SURGE_MULTIPLIER;
    }
}
