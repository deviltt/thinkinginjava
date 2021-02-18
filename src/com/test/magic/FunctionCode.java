package com.test.magic;

import java.util.function.Function;

class Magic {

}

class Basketball {

}

class FootBall {
    @Override
    public String toString() {
        return "足球";
    }
}

public class FunctionCode {
    public static void change(Function<Basketball, FootBall> function) {
        Basketball basketball = new Basketball();
        System.out.println(function.apply(basketball));
    }

    public static void main(String[] args) {
        change(new Function<Basketball, FootBall>() {
            @Override
            public FootBall apply(Basketball basketball) {
                return new FootBall();
            }
        });
    }
}
