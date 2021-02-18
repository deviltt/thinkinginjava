package com.designpattern.template;

public abstract class LeaveRequest {
    void request() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("本人");
        stringBuilder.append(name());
        stringBuilder.append("因");
        stringBuilder.append(reason());
        stringBuilder.append("需请假");
        stringBuilder.append(duration());
        stringBuilder.append("天, 望批准");
        System.out.println(stringBuilder.toString());
    }

    abstract String name();

    abstract String reason();

    abstract String duration();
}
