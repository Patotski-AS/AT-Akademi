package com.itacademy.javacore.homeWork.homeWork12.task6;

import java.util.Random;

public class GetThread implements Runnable {
    SynchronizedList<Integer> list;

    public GetThread(SynchronizedList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int x = new Random().nextInt(list.size());
            System.out.println(Thread.currentThread().getName() + ": по индексу [" + x + "] число: " +  list.get(x));
        }

    }
}
