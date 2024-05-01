package com.assignment.question;

public interface PricingStrategy {
    static final double BASE_FARE = 5.0; // Base fare amount

    PricingType supportsType();

    Double calculatePrice(RideDetails rideDetails);
}