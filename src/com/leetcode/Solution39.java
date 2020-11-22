package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. 组合总和
 */
public class Solution39 {
    private List<List<Integer>> res = new ArrayList<>();
    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) {
            return res;
        }

        this.candidates = candidates;
        Arrays.sort(candidates);
        dfs(0, target, new ArrayList<>());
        return res;
    }

    private void dfs(int index, int target, List<Integer> list) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                break;
            }
            list.add(candidates[i]);
            dfs(i, target - candidates[i], list);
            list.remove(list.size() - 1);
        }
    }
}
