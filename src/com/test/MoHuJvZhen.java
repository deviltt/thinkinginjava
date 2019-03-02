package com.test;

public class MoHuJvZhen {
    private static double[] findMax(double temp[]){
        for(int i = 1; i < temp.length; i++)
            temp[0] = temp[0] < temp[i] ? temp[i] : temp[0];
        return temp;
    }
    private static double[][] reverse(double R[][]){
        double[] temp = new double[R.length];
        /**
         * rij取值过程：先将第i行的每个值与第j列对应的值进行比较取小者，
         * 将每次比较的值存放在数组temp中
         * 找出temp中的最大值即为rij
         */
        for(int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++){
                for(int k = 0; k < temp.length; k++)
                    temp[k] = (R[i][k] < R[k][j] ? R[i][k] : R[k][j]);
                findMax(temp);
                R[i][j] = temp[0];
            }
        }
        return R;
    }
    private static boolean isEqual(double t[][], double R[][]){
        for(int i = 0; i < R.length; i++)
            for(int j = 0; j < R[0].length; j++)
                if(t[i][j] != R[i][j])
                    return false;
        return true;
    }
    public static void main(String[] args){
        double[][] R = new double[][]{
                {1.000, 0.941, 0.984, 0.967, 0.990, 0.992},
                {0.941, 1.000, 0.984, 0.995, 0.966, 0.950},
                {0.984, 0.984, 1.000, 0.996, 0.993, 0.986},
                {0.967, 0.995, 0.996, 1.000, 0.985, 0.973},
                {0.990, 0.966, 0.993, 0.985, 1.000, 0.998},
                {0.992, 0.950, 0.986, 0.973, 0.998, 1.000}};
        double[][] t = new double[R.length][R[0].length];
        boolean Continue = true;
        int cnt = 0;
        while(Continue) {
            //将模糊矩阵R的值复制到数组t中
            for (int i = 0; i < R.length; i++)
                for(int j = 0; j < R[0].length; j++)
                    t[i][j] = R[i][j];
            R = reverse(R); //将原数组进行转换
            cnt++;
            //比较转换后的矩阵是否与前一次转换的矩阵是否相等
            if(isEqual(t, R))
                Continue = false;
        }
        for(int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[0].length; j++)
                System.out.printf("%6.3f ", R[i][j]);
            System.out.println();
        }
        System.out.println("经历了 " + cnt + "次转换");
    }
}

