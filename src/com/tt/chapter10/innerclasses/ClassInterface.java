package com.tt.chapter10.innerclasses;

public interface ClassInterface {
    void howdy();
    class Test implements ClassInterface{
        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
