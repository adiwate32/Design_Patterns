package com.assignment.question;

public interface TravelInsuranceAdapter {
    void addClaim(String id, Double amount);
    String getStatus(String id);
}