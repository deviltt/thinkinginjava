package com.leetcode;

/**
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。
 * 如果之后都不会升高，请输入 0 来代替。
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，
 * 你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]
 */
public class Solution739 {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        result[result.length - 1] = 0;  //最后一天的温度肯定不会升高的
        for (int i = T.length - 2; i >= 0; i--) {
            for (int j = i + 1; j < T.length; j += result[j]) {
                if (T[i] < T[j]) {
                    result[i] = j - i;
                    break;
                } else if (result[j] == 0) { //如果后一个数为0，说明后面没有再比它大的值了，也就不用再遍历下去了
                    result[i] = 0;
                    break;
                }
            }
        }
        return result;
    }
}
