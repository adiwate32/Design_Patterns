package com.assignment.question;

import com.assignment.question.external.AutoProtectApi;

public class AutoProtectAdapter implements TravelInsuranceAdapter{
    private AutoProtectApi autoProtectApi;
    public AutoProtectAdapter() {
        autoProtectApi = new AutoProtectApi();
    }
    @Override
    public void addClaim(String id, Double amount) {
        autoProtectApi.addClaim(amount);
    }

    @Override
    public String getStatus(String id) {
        return autoProtectApi.getStatus(id).toString();
    }
}
