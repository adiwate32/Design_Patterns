package com.assignment.question;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightRegistryImpl implements FlyweightRegistry{
    Map<String, UserIntrinsicState> userIntrinsicStateMap = new HashMap<>();
    @Override
    public void addFlyweight(UserIntrinsicState flyweight) {
        userIntrinsicStateMap.put(flyweight.getEmail(), flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {
        return userIntrinsicStateMap.get(email);
    }
}
