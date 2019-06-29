package com.tt.chapter18.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class UsingBuffers {
    public static void main(String[] args) {
        char[] data="UsingBuffers".toCharArray();
        ByteBuffer byteBuffer=ByteBuffer.allocate(data.length*2);
        CharBuffer charBuffer=byteBuffer.asCharBuffer();
        charBuffer.put(data);
        //如果直接打印缓存器的话，则只会打印position和limit之间的内容，因此需要使用rewind
        System.out.println(charBuffer.rewind());    //rewind的作用：将position恢复到起始的位置
        symmetricScramble(charBuffer);
        System.out.println(charBuffer.rewind());
        symmetricScramble(charBuffer);
        System.out.println(charBuffer.reset());
    }

    private static void symmetricScramble(CharBuffer charBuffer) {
        while (charBuffer.hasRemaining()){
            charBuffer.mark();  //将mark指针指向position的位置
            char c1=charBuffer.get();   //获取position当前位置的值，并且position后移一位
            char c2=charBuffer.get();
            charBuffer.reset();     //重置position指针，将position指向mark当前的位置
            charBuffer.put(c2).put(c1);
        }
    }
}
