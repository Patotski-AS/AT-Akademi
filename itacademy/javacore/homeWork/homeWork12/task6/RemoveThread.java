package com.itacademy.javacore.homeWork.homeWork12.task6;

import java.util.Random;

public class RemoveThread implements Runnable {
    SynchronizedList<Integer> list;

    public RemoveThread(SynchronizedList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int x;
            list.remove(x = new Random().nextInt(list.size()));
            System.out.println(Thread.currentThread().getName() + " удалил число  " + x );
            list.print();

        }

    }
}
