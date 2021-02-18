package com.designpattern.state;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.mockInterview();

        user.purchasePlus();
        user.mockInterview();

        user.expire();
        user.mockInterview();
    }
}
