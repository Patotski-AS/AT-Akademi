package com.patternes.observer;

/**
 * интерфейс, определяющий методы для добавления, удаления и оповещения наблюдателей;
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
