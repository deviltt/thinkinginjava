package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList<>();

    // 添加观察者
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // 通知观察者
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
