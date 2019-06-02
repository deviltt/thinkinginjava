package com.tt.chapter19.enumerated;

import com.leetcode.tree.TreeNode;

/**
 * 功能：模拟交通灯红绿黄循环显示
 */
enum Signal {
    GREEN, YELLOW, RED
}

public class TrafficLight {
    private Signal color = Signal.RED;

    @Override
    public String toString() {
        return "the traffic light is: " + color;
    }

    private void change() {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(trafficLight);
            trafficLight.change();
        }
    }
}
