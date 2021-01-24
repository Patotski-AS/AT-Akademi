package com.itacademy.javacore.homeWork.homeWork12.task6;

import java.util.Random;

public class AddThread implements Runnable {
    SynchronizedList<Integer> list;

    public AddThread(SynchronizedList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            int x;
            list.add(x = new Random().nextInt(100 + 1));
            System.out.println(Thread.currentThread().getName() + " добавил число " + x);
        }

    }
}
