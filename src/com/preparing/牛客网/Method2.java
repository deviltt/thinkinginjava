package com.preparing.牛客网;

import java.util.*;

public class Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while (scanner.hasNext()){
            int n=scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {

                set.add(scanner.nextInt());
            }
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        }


    }
}
