package com.patternes.observer;

import java.util.List;

/**
 * конкретный класс, который реализует интерфейс Observable;
 */
public class ConcreteObservable implements Observable {
    List<Observer> observers;


    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
