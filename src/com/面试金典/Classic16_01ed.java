package com.面试金典;

/**
 * 位运算
 * num[0] = num[0] ^ num[1];
 * num[1] = num[1] ^ num[0] = num[1] ^ num[1] ^ num[0] = 0 ^ num[0] = num[0]
 * num[0] = num[0] * num[1] = (num[0] ^ num[1]) ^ num[0] = num[1]
 */
public class Classic16_01ed {
    public int[] swapNumbers(int[] numbers) {
        numbers[0] ^= numbers[1];
        numbers[1] ^= numbers[0];
        numbers[0] ^= numbers[1];
        return numbers;
    }
}
