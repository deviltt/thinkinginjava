package com.tt.chapter14.typeinfo.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {
    private Random random = new Random(47);

    /**
     * 定义了一个生成动物种类集合的抽象方法，任何继承抽象类的导出类都必须实现这个方法
     * @return
     */
    public abstract List<Class<? extends Pet>> types();

    /**
     * 方法功能：随机产生一个宠物的对象
     * @return
     */
    public Pet randomPet(){
        //通过types();方法产生一个Pet集合，里面存放的Class对象, n一定是小于list集合的
        int n = random.nextInt(types().size());
        Pet pet = null;
        try {
            pet = types().get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return pet;
    }

    /**
     * 生成Pet数组
     * @param size
     * @return
     */
    public Pet[] createArray(int size){
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }

    /**
     * 生成Pet集合
     * @param size
     * @return
     */
    public ArrayList<Pet> arrayList(int size){
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
