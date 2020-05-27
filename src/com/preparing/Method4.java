package com.preparing;

import java.util.Scanner;

class TempList {
    int index;
    TempList next;

    public TempList(int index) {
        this.index = index;
    }
}

public class Method4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int n = scanner.nextInt();

            //构造一个循环链表
            TempList dummyHead = new TempList(-1);
            TempList head = buildLinkList(dummyHead, n);
            TempList prev = dummyHead;

            int count = 1;

            while (head.next != head) {
                prev = head;
                head = head.next;
                ++count;

                if (count == 3) {
                    //todo 删除当前节点
                    prev.next=head.next;
                    head.next=null;
                    head=prev.next;
                    count=1;
                }
            }

            System.out.println(head.index);
        }
    }

    private static TempList buildLinkList(TempList dummyHead, int n) {

        TempList head = dummyHead;

        for (int i = 0; i < n; i++) {
            TempList temp = new TempList(i);
            head.next = temp;
            head = head.next;
        }
        head.next = dummyHead.next;

        return dummyHead.next;
    }
}
