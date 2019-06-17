package com.tt.chapter18.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * 通道的对接
 * transformTo, transformFrom
 */
public class TransferTo {
    public static void main(String[] args) throws IOException {
        FileChannel in= new FileInputStream("./demo/test.out").getChannel(),
                out=new FileOutputStream("data2.txt").getChannel();
        in.transferTo(0,in.size(),out);

//        out.transferFrom(in,0,in.size());
    }
}
