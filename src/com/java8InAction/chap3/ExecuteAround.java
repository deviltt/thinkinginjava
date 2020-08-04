package com.java8InAction.chap3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAround {
    public static void main(String... args) throws IOException {

        // method we want to refactor to make more flexible
//        String result = processFileLimited();
//        System.out.println(result);
//
//        System.out.println("---");
//
        String oneLine = processFile((BufferedReader b) -> b.readLine());
        System.out.println(oneLine);

        String twoLines = processFile((BufferedReader b) -> b.readLine() + b.readLine());
        System.out.println(twoLines);

    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./src/com/java8InAction/chap5/data.txt"));
        return p.process(br);
    }

    @FunctionalInterface
    public interface BufferedReaderProcessor {
        public String process(BufferedReader b) throws IOException;
    }
}
