package com.preparing;

import java.util.HashMap;
import java.util.Map;

public class Solution9743ed {
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);   //如果数组本身所有的和加起来正好模K，如果没有这一句，same值是0，明显少了一个
        int sum = 0, ans = 0;
        for (int temp : A) {
            sum += temp;
            int mod = (sum % K + K) % K;
            //p[j]-p[i] % K =0
            //第一次遇到p[i]模K时，保存{ p[i]%K : 0}
            //如果第二次遇到           { p[j]%K : 1}
            int same = map.getOrDefault(mod, 0);
            ans += same;
            map.put(mod, same + 1);
        }
        return ans;
    }
}
