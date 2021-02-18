package com.designpattern.template;

public class MyLeaveRequest extends LeaveRequest{

    @Override
    String name() {
        return "小苏苏";
    }

    @Override
    String reason() {
        return "见家长";
    }

    @Override
    String duration() {
        return "3";
    }
}
