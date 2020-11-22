package com.剑指offer;

/**
 * 剑指 Offer 17. 打印从1到最大的n位数(递归法)
 */
public class Offer17ed {
    private int n;
    private char[] loop = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private int numberOfNine, startIndex, count;
    private char[] num;
    private int[] res;

    public int[] printNumbers(int n) {
        this.n = n;
        this.count = 0;
        this.numberOfNine = 0;    //计数9的个数
        this.startIndex = n - 1;      //从哪一个位置开始截取字符串，舍去前面的0
        this.num = new char[n];     //用于递归，固定高位的数字
        this.res = new int[(int) Math.pow(10, n) - 1];  //结果数组
        dfs(0);
        return res;
    }

    private void dfs(int x) {
        //递归终止条件
        if (x == n) {
            //如果一共出现0次9，那么从最后一位截取字符串，没出现一次9
            String s = String.valueOf(num).substring(startIndex);
            if (!s.equals("0")) {
                res[count++] = Integer.parseInt(s);
            }
            if (n - startIndex == numberOfNine) {
                --startIndex;
            }
            return;
        }

        for (char c : loop) {
            if (c == '9') {
                ++numberOfNine;
            }
            num[x] = c;
            dfs(x + 1);
        }
        //自减的原因：以n=2为例，当保存1,2,...,9之后，
        // 跳出循环，此时numberOfNine的值为1，如果不进行自减，
        // 那么当num[0]=1的时候，当c='9'，numberOfNine自增，此时numberOfNine=2
        // n - startIndex == numberOfNine 成立，--startIndex 之后 startIndex = -1
        //很明显出现了越界的错误，因此每次递归结束之后要对numberOfNine进行自减
        --numberOfNine;
    }
}
