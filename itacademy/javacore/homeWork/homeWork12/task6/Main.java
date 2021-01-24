package com.itacademy.javacore.homeWork.homeWork12.task6;



//(*-необязательная задача) Создать класс SynchronizedList.
//        Внутри него будет поле ArrayList. Реализовать методы add(Object obj),
//        remove(Object obj), get(int index). Сделать так, чтобы добавлять
//        и удалять из списка в один момент мог только один поток,
//        а получать элемент по индексу могли сколько угодно потоков,
//        но только если в это время не происходит изменения списка(добавление/удаление).
//        Протестировать его на нескольких потоках.


public class Main {
    public static void main(String[] args) {
        SynchronizedList<Integer> list = new SynchronizedList<>();

        new Thread(new AddThread(list)).start();
        new Thread(new RemoveThread(list)).start();
        new Thread(new GetThread(list)).start();


    }
}