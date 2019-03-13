package com.list;

public class TailInsertListWithoutHeadNode {
    private static MyList createList(int n) {
        MyList head, rear;
        rear = head = null;
        int i = 0;
        while (i <= n) {
            MyList temp = new MyList(i++);
            if (head == null) {
                head = temp;
                rear = head;
            } else {
                rear.next = temp;
                rear = temp;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        MyList head = createList(5);
        while (head != null) {
            System.out.print(head.i + " ");
            head = head.next;
        }
    }
}
