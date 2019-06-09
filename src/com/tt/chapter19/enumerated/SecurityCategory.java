package com.tt.chapter19.enumerated;

enum SecurityCategory {
    STOCK(Security.Stock.class), BOND(Security.Bond.class);
    Security[] values;

    //每一个SecurityCategory实例都持有一个values数组
    SecurityCategory(Class<? extends Security> kind) {
        values = kind.getEnumConstants();
    }

    //接口的目的：将其所包含的enum组合成一个公共类型
    interface Security {
        enum Stock implements Security {SHORT, LONG, MARGIN}

        enum Bond implements Security {MUNICIPAL, JUNK}
    }

    public Security randomSelection() {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SecurityCategory securityCategory = Enums.random(SecurityCategory.class);   //因此随机生成一个SecurityCategory实例对象
            System.out.println(securityCategory+" "+securityCategory.randomSelection());    //这个实例对象里面有values属性，将这个对象的values传给randomSelection
        }
    }
}
