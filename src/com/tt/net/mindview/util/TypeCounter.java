package com.tt.net.mindview.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用Class.isAssignableFrom();创建一个不局限于对Pet计数的通用工具
 */
public class TypeCounter extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;
    public TypeCounter(Class<?> baseType){
        this.baseType = baseType;
    }
    public void count(Object object){
        Class<?> type = object.getClass();
        //如果传入的类型不是baseType基类型的导出类则报错
        if (!baseType.isAssignableFrom(type)){
            throw new RuntimeException(object + " incorrent type: " + type + ", should be type or subtype of " + baseType);
        }
        countClass(type);
    }
    private void countClass(Class<?> type) {
        put(type, getOrDefault(type, 0) + 1);
        Class<?> superClass = type.getSuperclass();
        //递归的对导出类向上计数，直到基类为止
        if (superClass != null && baseType.isAssignableFrom(superClass))
            countClass(type);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Map.Entry<Class<?>, Integer> pair : entrySet()){
            stringBuilder.append(pair.getKey().getSimpleName());
            stringBuilder.append("=");
            stringBuilder.append(pair.getValue());
            stringBuilder.append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
