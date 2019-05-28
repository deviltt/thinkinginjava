package com.tt.chapter15.generics;

public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;

        //无参构造函数
        Node() {
            item = null;
            next = null;
        }

        //有参构造函数
        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;   //当前的next节点指向传入的节点
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>();

    public void push(T item) {
        top = new Node<>(item, top);   //先创建一个节点，该节点的next指向当前的top，再更新top指向当前刚创建的节点
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            linkedStack.push(s);
        }
        String s;
        while ((s = linkedStack.pop()) != null)
            System.out.println(s);
    }
}
