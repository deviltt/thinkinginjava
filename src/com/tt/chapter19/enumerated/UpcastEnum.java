package com.tt.chapter19.enumerated;

enum Search {HITHER, ON}

/**
 * 使用Class对象的getEnumConstants()方法来获取所有enum的实例
 */
public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER; //获取enum实例
//        e.values();
        for (Enum en:e.getClass().getEnumConstants())
            System.out.println(en);
    }
}
