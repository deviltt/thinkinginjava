package com.designpattern.ObserverPattern.basketball;

public interface Subject {
    void notifyAllObserver();
    void removeObserver(Observer observer);
    void addObserver(Observer observer);
}
