package com.tt.chapter11.hoding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
    public static void printQ(Queue queue){
        while (queue.peek() != null){
            System.out.print(queue.remove() + " "); //remove();方法如果队列为空则抛出异常
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i + 10));
        }
        printQ(queue);
        Queue<Character> queue1 = new LinkedList<>();
        for(char c : "love".toCharArray()){
            queue1.add(c);
        }
        printQ(queue);
    }
}
