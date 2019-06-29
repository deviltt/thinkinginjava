package com.tt.chapter19.enumerated.menu;

import java.text.DateFormat;
import java.util.Date;

/**
 * 为每一个enum实例编写方法
 */
public enum  ConstantSpecificMethod {
    DATE_TIME{
        String getInfo(){
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH{
        String getInfo(){
            return System.getenv("CLASSPATH");
        }
    },
    VERSION{
        String getInfo(){
            return System.getProperty("java.version");
        }
    };
    abstract String getInfo();

    public static void main(String[] args) {
        for(ConstantSpecificMethod csm:values()){
            System.out.println(csm.getInfo());
        }
    }
}
