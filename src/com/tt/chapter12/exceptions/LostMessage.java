package com.tt.chapter12.exceptions;

class VeryImportantException extends Exception{
    @Override
    public String toString() {
        return "A very important exception";
    }
}

class HoHumException extends Exception{
    @Override
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessage {
    private void f() throws VeryImportantException{
        throw new VeryImportantException();
    }

    private void dispose() throws HoHumException{
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lostMessage=new LostMessage();
            try {
                lostMessage.f();
            }finally {
                lostMessage.dispose();  //这里并没有处理f()方法抛出的异常，dispose方法的异常直接将其给覆盖掉了，造成异常的丢失
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
