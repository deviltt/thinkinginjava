package com.tt.chapter18.io;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("./src/com/tt/chapter18/io/MemoryInput.java"));
        int c = 0;
        while ((c = in.read()) != -1){
            System.out.println(c);
        }
    }
}
