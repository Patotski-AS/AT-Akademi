package com.itacademy.javacore.homeWork.homeWork12.task6;

import java.util.ArrayList;

//(*-необязательная задача) Создать класс SynchronizedList.
//        Внутри него будет поле ArrayList. Реализовать методы add(Object obj),
//        remove(Object obj), get(int index). Сделать так, чтобы добавлять
//        и удалять из списка в один момент мог только один поток,
//        а получать элемент по индексу могли сколько угодно потоков,
//        но только если в это время не происходит изменения списка(добавление/удаление).
//        Протестировать его на нескольких потоках.

public class SynchronizedList<E> {
    private final ArrayList<E> list;

    public SynchronizedList() {
        list = new ArrayList<>();
    }

    public void add(E element) {
        synchronized (list) {
            list.add(element);
            print();
        }
    }

    public void remove(E element){
        synchronized (list) {
            list.remove(element);
        }
    }

    public E get(int index){
        return list.get(index);
    }

    public void print(){
        System.out.println(list.toString());
    }

    public int size(){
        return list.size();
    }

}
