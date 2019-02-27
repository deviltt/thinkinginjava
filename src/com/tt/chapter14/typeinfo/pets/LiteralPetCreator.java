package com.tt.chapter14.typeinfo.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
    public static final List<Class<? extends  Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class,
                    Pug.class, EgyptianMau.class, Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class));

    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    public List<Class<? extends Pet>> types(){
        return types;
    }

    public static void main(String[] args) {
        //类的打印信息在Individual类中定义了toString();方法:getClass().getSimpleName() + " name"
        System.out.println(types);
    }
}
