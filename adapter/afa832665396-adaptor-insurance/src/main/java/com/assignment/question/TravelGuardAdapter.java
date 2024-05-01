package com.assignment.question;

import com.assignment.question.external.TravelGuardApi;

public class TravelGuardAdapter implements TravelInsuranceAdapter{
    private TravelGuardApi travelGuardApi;

    public TravelGuardAdapter() {
        travelGuardApi = new TravelGuardApi();
    }
    @Override
    public void addClaim(String id, Double amount) {
        travelGuardApi.submitClaim(id, amount);
    }

    @Override
    public String getStatus(String id) {
        return travelGuardApi.getClaimStatus(id);
    }
}
