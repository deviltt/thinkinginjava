package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {
    public static int[] getTimes(int[] arrTime, int[] direction) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int[] result = new int[arrTime.length];

        int index = 0;
        int time = 0;
        Boolean bool = null;

        while (index < arrTime.length) {
            if (time == arrTime[index]) {
                if (direction[index] == 1) {
                    q1.add(index);
                } else {
                    q2.add(index);
                }
                ++index;
            } else {
                if ((bool == null || bool) && !q1.isEmpty()) {
                    result[q1.poll()] = time++;
                    bool = true;
                    while (time != arrTime[index] && !q1.isEmpty()) {
                        result[q1.poll()] = time++;
                    }
                    continue;
                }
                if ((bool == null || bool) && !q2.isEmpty()) {
                    result[q2.poll()] = time++;
                    bool = false;
                    while (time != arrTime[index] && !q2.isEmpty()) {
                        result[q2.poll()] = time++;
                    }
                    continue;
                }
                while (time != arrTime[index]) {
                    ++time;
                    // 上一秒不相同要重置
                    bool = null;
                }
            }
        }

        if (bool==null||bool){
            while (!q1.isEmpty()){
                result[q1.poll()] = time++;
            }

            while (!q2.isEmpty()){
                result[q2.poll()] = time++;
            }
        }else{
            while (!q2.isEmpty()){
                result[q2.poll()] = time++;
            }

            while (!q1.isEmpty()){
                result[q1.poll()] = time++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] res= getTimes(new int[]{0, 0, 1, 5}, new int[]{0, 1, 1, 0});
//        int[] res = getTimes(new int[]{2, 2, 2, 2, 3, 3, 5, 5, 20, 20}, new int[]{0, 1, 1, 0, 0, 1, 1, 0, 0, 1});
        int[] res = getTimes(new int[]{2, 2, 2, 2, 3, 3, 6, 9, 10, 10}, new int[]{0, 1, 1, 0, 0, 1, 1, 0, 0, 1});

        System.out.println(res[0]); // 8
    }
}
