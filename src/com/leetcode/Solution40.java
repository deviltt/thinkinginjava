package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. 组合总和 II
 * 双重剪枝逻辑
 */
public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res, new ArrayList<>(), -1, target, candidates);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> list, int index, int target, int[] candidates) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index + 1; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                return;
            }
            //去重的小剪枝，当后一个数和前一个数相同的时候，那后面匹配的结果肯定是和之前重复的
            if (i > (index + 1) && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            dfs(res, list, i, target - candidates[i], candidates);
            list.remove(list.size() - 1);
        }
    }
}
