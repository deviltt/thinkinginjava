package com.tt.chapter19.enumerated.demo;

/**
 * 除非使用EnumSet和EnumMap，否则完全避免使用ordinal方法返回
 * 每个枚举常量在类型中的数字位置，应该将其保存在一个实例域中
 */
public enum Ensemble {
    SOLO(1), DUET(2), TRIO(2), QUARTET(3);

    private final int numberOfMusicians;

    Ensemble(int numberOfMusicians) {
        this.numberOfMusicians = numberOfMusicians;
    }

    public int numberOfMusicians() {
        return numberOfMusicians + 1;
    }

    public static void main(String[] args) {
        for (Ensemble ensemble:values()){
            System.out.println(ensemble.numberOfMusicians());
        }
    }
}
