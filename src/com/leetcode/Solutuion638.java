package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入: [2,5], [[3,0,5],[1,2,10]], [3,2]
 * 输出: 14
 * 解释:
 * 有A和B两种物品，价格分别为¥2和¥5。
 * 大礼包1，你可以以¥5的价格购买3A和0B。如果单买需要6元
 * 大礼包2， 你可以以¥10的价格购买1A和2B。如果单买需要12元
 * 你需要购买3个A和2个B， 所以你付了¥10购买了1A和2B（大礼包2），以及¥4购买2A。
 * <p>
 * 即可以选择将大礼包和单个购买组合起来，达到最小的花费
 */
public class Solutuion638 {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        //首先计算不使用礼包所需要的价格
        int res = 0;
        for (int i = 0; i < needs.size(); i++) {
            res += price.get(i) * needs.get(i);
        }
        //对于每一种大礼包的情况进行递归，找出最小的可能
        for (List<Integer> list : special) {
            List<Integer> cuter = cut(list, needs);
            if (cuter == null)    //如果返回值为null，说明这个礼包中商品的数量不符合需求，直接pass
                continue;
            res = Math.min(res, list.get(list.size() - 1) + shoppingOffers(price, special, cuter));
        }
        return res;
    }

    /**
     * 剪枝函数，如果礼包的商品数量符合需求，则将needs中的对应商品数量去掉
     * @param list
     * @param needs
     * @return
     */
    private List<Integer> cut(List<Integer> list, List<Integer> needs) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < needs.size(); i++) {
            int remainder = needs.get(i) - list.get(i);
            if (remainder < 0)
                return null;
            result.add(remainder);
        }
        return result;
    }

}
