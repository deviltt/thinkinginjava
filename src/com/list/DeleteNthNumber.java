package com.list;

public class DeleteNthNumber {
    public static void main(String[] args) {
        MyList head = createList(5);
        while (head != null){
            System.out.print(head.i + " ");
            head = head.next;
        }
    }

    private static MyList createList(int n){
        int i = 0;
        MyList head = null;
        for (;i < n; i++){
            MyList temp = new MyList(i);
            temp.next = head;
            head = temp;
        }
        return head;
    }
}
