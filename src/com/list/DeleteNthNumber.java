package com.list;

public class DeleteNthNumber {
    public static void main(String[] args) {
        MyList head = createList(5);
        MyList p = head;
        //删除第三个节点
        deleteNode(head, 3);
        while (p != null){
            System.out.print(p.i + " ");
            p = p.next;
        }
    }

    private static void deleteNode(MyList head, int pos) {
        //删除节点的关键是要记录待删除节点的前一个节点
        MyList post = head.next;
        for (int i = 1; i < pos - 1; i++){
            head = post;
            post = head.next;
        }
        head.next = post.next;
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
