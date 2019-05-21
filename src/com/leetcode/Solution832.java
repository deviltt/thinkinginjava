package com.leetcode;

/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * 思路：即先把每一行翻转，再遍历二维数组取反
 */
public class Solution832 {
    public static int[][] flipAndInvertImage(int[][] A) {
        //将每一行翻转
        for (int i = 0; i < A.length; i++) {
            reverse(A[i]);
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = A[i][j] == 1 ? 0 : 1;
            }
        }
        return A;
    }

    /**
     * 翻转数组
     * @param arr 传入的数组
     */
    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int A[][] = flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
