package com.assignment.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Publisher implements ObserverRegistry{
    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){
       observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(String stockName, double currentPrice){
        observerList.forEach(observer -> observer.notify(stockName, currentPrice));
    }
}