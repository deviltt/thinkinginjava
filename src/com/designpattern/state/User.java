package com.designpattern.state;

public class User implements ISwitchState, IUser {
    IUser state = new Normal();

    @Override
    public void purchasePlus() {
        state = new Plus();
    }

    @Override
    public void expire() {
        state = new Normal();
    }

    @Override
    public void mockInterview() {
        state.mockInterview();
    }
}
