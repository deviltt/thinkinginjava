package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1282. 用户分组
 * 输入：groupSizes = [3,3,3,3,3,1,3]
 * 输出：[[5],[0,1,2],[3,4,6]]
 * 解释：
 * 其他可能的解决方案有 [[2,1,6],[5],[0,4,3]] 和 [[5],[0,6,2],[4,3,1]]。
 */
public class Solution1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int group = groupSizes[i];
            if (!map.containsKey(group)) {
                map.put(group, new ArrayList<>());
            }
            List<Integer> list = map.get(group);
            list.add(i);
            if (list.size() == group) {
                result.add(new ArrayList<>(list));  //必须新建一个arrayList，不然会随着list.clear()变为空集合
                list.clear();
            }
        }
        return result;
    }
}
