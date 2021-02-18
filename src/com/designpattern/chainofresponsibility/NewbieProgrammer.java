package com.designpattern.chainofresponsibility;

public class NewbieProgrammer extends Programmer {
    @Override
    void handle(Bug bug) {
        if (bug.value > 0 && bug.value <= 20) {
            // 表示自己可以解决
            solve(bug);
        } else if (next != null) {
            // 给下一个人处理
            next.handle(bug);
        }
    }

    private void solve(Bug bug) {
        System.out.println("菜鸟程序员解决了一个难度为 " + bug.value + " 的 bug");
    }
}
