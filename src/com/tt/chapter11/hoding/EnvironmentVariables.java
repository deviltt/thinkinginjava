package com.tt.chapter11.hoding;

import java.util.Map;

public class EnvironmentVariables {
    public static void main(String[] args) {
        System.out.println("键值对集合entrySet();==========>>");
        for(Map.Entry entry : System.getenv().entrySet()){
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
        System.out.println("键集合keySet();==========>>");
        for (String key : System.getenv().keySet()){
            System.out.println(key);
        }
        System.out.println("值集合values();==========>>");
        for (String value : System.getenv().values()){
            System.out.println(value);
        }
    }
}
