package com.剑指offer;

import java.util.Stack;

public class Question09 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public Question09() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void appendTail(int value) {
        //先把stack1的元素全部移动到stack2中
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int deleteHead() {
        if (stack1.size()==0){
            return -1;
        }
        return stack1.pop();
    }
}
