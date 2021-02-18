package com.designpattern.state;

public class Normal implements IUser {
    @Override
    public void mockInterview() {
        System.out.println("模拟面试是 Plus 会员专享功能");
    }
}
