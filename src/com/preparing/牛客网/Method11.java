package com.preparing.牛客网;

import java.util.*;

/**
 * 合并表记录
 */
public class Method11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + scanner.nextInt());
            } else {
                map.put(key, scanner.nextInt());
            }
        }

        //对map排序后输出
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>();

        Iterator<Map.Entry<Integer, Integer>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getKey() - o2.getKey();
            }
        });

        for (int i = 0; i < list.size(); i++) {
            Map.Entry<Integer, Integer> entry=list.get(i);
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
