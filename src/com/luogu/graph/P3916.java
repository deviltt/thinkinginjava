package com.luogu.graph;

import java.util.*;

/**
 * 反向建边：只要是 原点 开始的路径 上面的点的最大值就是原点
 */
public class P3916 {
    private static Map<Integer, List<Integer>> edges = new HashMap<>();
    private static boolean[] flag;
    private static int[] result;

    private static void dfs(int key, int max) {
        //如果被访问过了
        if (flag[key]) {
            return;
        }
        result[key] = max;
        flag[key] = true;
        List<Integer> tempList = edges.get(key);
        if (tempList != null) {
            for (int i = 0; i < edges.get(key).size(); i++) {
                dfs(edges.get(key).get(i), max);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        flag = new boolean[N + 1];
        result = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int value = scanner.nextInt();
            int key = scanner.nextInt();
            if (!edges.containsKey(key)) {
                List<Integer> list = new ArrayList<>();
                list.add(value);
                edges.put(key, list);
            } else {
                edges.get(key).add(value);
            }
        }
        for (int i = N; i >= 1; i--) {
            dfs(i, i);
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
