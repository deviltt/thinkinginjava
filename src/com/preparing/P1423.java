package com.preparing;

import java.util.Scanner;

public class P1423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        int step = 1;
        double sum = 2,countDistance = 2;
        while (sum < distance) {
            countDistance *= 0.98;
            sum += countDistance;
            ++step;
        }
        System.out.println(step);
    }
}
