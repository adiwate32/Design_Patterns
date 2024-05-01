package com.assignment.question;

import lombok.Getter;

@ExtrinsicState
@Getter
public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;
    UserIntrinsicState userIntrinsicState;
}