package com.preparing;

import java.util.*;

public class P5727 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> linkedList = new LinkedList<>();

        while (n != 1) {
            linkedList.add(n);

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
        }
        linkedList.add(1);

        Collections.reverse(linkedList);

        Integer[] arr = new Integer[linkedList.size()];
        linkedList.toArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}
