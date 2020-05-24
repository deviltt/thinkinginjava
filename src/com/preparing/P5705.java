package com.preparing;

import java.util.Scanner;

public class P5705 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            float num = scanner.nextFloat();
            StringBuilder stringBuilder = new StringBuilder("" + num);
            System.out.println( new Float(stringBuilder.reverse().toString()));
        }
    }
}
