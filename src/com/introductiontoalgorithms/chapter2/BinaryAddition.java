package com.introductiontoalgorithms.chapter2;

public class BinaryAddition {
    public static String[] binaryAddition(String a, String b) {
        String[] charsA = a.split("");
        String[] charsB = b.split("");
        String[] result = new String[a.length() + 1];
        int j = result.length - 1;
        int carry = 0;    //进位
        for (int i = charsA.length - 1; i >= 0; i--) {
            result[j] = String.valueOf((Integer.parseInt(charsA[i]) + Integer.parseInt(charsB[i]) + carry) % 2);
            carry = (Integer.parseInt(charsA[i]) + Integer.parseInt(charsB[i]) + carry) / 2;
            --j;
        }
        result[j] = String.valueOf(carry);  //这一步不能忘了，不然第0位为null
        return result;
    }

    public static void main(String[] args) {
        String[] result = binaryAddition("1001", "1001");
        for (String s : result)
            System.out.print(s);
    }
}
