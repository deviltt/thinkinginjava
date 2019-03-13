package com.list;

/**
 * 带头结点的尾插法创建链表
 */
public class TailInsertListWithHeadNode {
    public static void main(String[] args) {
        MyList head = createList(5);
        MyList temp = head.next;
        while (temp != null) {
            System.out.print(temp.i + " ");
            temp = temp.next;
        }
    }

    private static MyList createList(int n) {
        MyList head = new MyList(-1);
        MyList rear = head;
        int i = 0;
        while (i <= n) {
            MyList temp = new MyList(i++);
            rear.next = temp;
            rear = temp;
        }
        return head;
    }
}
