package com.tt.chapter22.gui;

import javax.swing.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame=new JFrame("hello world"); //框架的标题
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //执行关闭操作时应该做什么：退出程序
        frame.setSize(300,100); //框架大小
        frame.setVisible(true); //框架的可见性
    }
}
