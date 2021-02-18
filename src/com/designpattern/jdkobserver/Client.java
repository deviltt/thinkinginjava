package com.designpattern.jdkobserver;

public class Client {
    public static void main(String[] args) {
        BigNew bigNew = new BigNew();

        bigNew.addObserver(new Alibaba());
        bigNew.addObserver(new Tecent());

        bigNew.broadcast("网易挂了");

        bigNew.broadcast1("腾讯挂了");
    }
}
