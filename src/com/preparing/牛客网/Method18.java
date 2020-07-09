package com.preparing.牛客网;

import java.util.*;

public class Method18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int n = scanner.nextInt();
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = scanner.next();
            }
            String res = scanner.next();
            int index = scanner.nextInt();

            List<String> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (isNeighbor(strings[i], res)) {
                    list.add(strings[i]);
                }
            }

            System.out.print(list.size() + "\n" + list.get(index - 1) + "\0\n");
        }


    }

    private static boolean isNeighbor(String string, String res) {
        //相同或者长度相同返回false
        if (string.length() != res.length() || string.equals(res)) {
            return false;
        }

        char[] chars1 = string.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = res.toCharArray();
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}
