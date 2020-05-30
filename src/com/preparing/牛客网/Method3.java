package com.preparing.牛客网;

import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            StringBuffer sb=new StringBuffer();
            sb.append(scanner.next());

            System.out.println(sb.toString());
//
//            char[] chars = sb.toString().toCharArray();
//
//            int[] arr = new int[]{10, 11, 12, 13, 14, 15};
//
//            int sum = 0;
//            for (int i = chars.length - 1; i > 1; i--) {
//                int temp = chars[i] - 'A';
//                if (temp < 0) {
//                    sum += (chars[i] - '0') * Math.pow(16, chars.length - i - 1);
//                } else {
//                    sum += arr[temp] * Math.pow(16, chars.length - i - 1);
//                }
//            }
//            System.out.println(sum);
        }


    }
}

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            StringBuffer sb=new StringBuffer();
//            sb.append(sc.next());
//            //String str=sc.next();
//            String str=sb.reverse().substring(0,sb.length()-2);
//            char ch[]=str.toCharArray();
//            int sum=0;
//            for(int i=0;i<ch.length;i++){
//                if(ch[i]>='A'&&ch[i]<='F'){
//                    sum+=(Integer.valueOf(ch[i])-55)*Math.pow(16,i);
//                }else {
//                    sum+=(Integer.valueOf(ch[i])-48)*Math.pow(16,i);
//                }
//            }
//            System.out.println(sum);
//            // System.out.println(Integer.valueOf('6'));
//        }
//    }
