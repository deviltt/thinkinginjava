package com.designpattern.ObserverPattern.basketball;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasketballManagement implements Subject {
    private Date startTime;
    private List<Observer> basketballFansList;

    public BasketballManagement() {
        basketballFansList = new ArrayList<>();
    }

    /**
     * 遍历所有订阅主题的篮球爱好者，然后跟新消息
     */
    @Override
    public void notifyAllObserver() {
        for (int i = 0; i < basketballFansList.size(); i++) {
            basketballFansList.get(i).update(startTime);
        }
    }

    /**
     * 更新时间
     * @param date
     */
    public void updateTime(Date date) {
        this.startTime = date;
        notifyAllObserver();
    }
    
    /**
     * 移除订阅者
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        basketballFansList.remove(observer);
    }

    /**
     * 添加订阅者
     * @param observer
     */
    @Override
    public void addObserver(Observer observer) {
        basketballFansList.add(observer);
    }
}
