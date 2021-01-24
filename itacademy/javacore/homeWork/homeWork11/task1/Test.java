package com.itacademy.javacore.homeWork.homeWork11.task1;

import java.util.Arrays;

public class Test extends Thread {
    private int[] ints = new int[10];

    @Override
    public void run() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 50 + 1);
        }
        System.out.println("noSort: " + Arrays.toString(ints) + " " + currentThread().getName() );
        Arrays.sort(ints);
        System.out.println("sort: " + Arrays.toString(ints) + " " + currentThread().getName() );
        System.out.println(currentThread().getName()  + ", max:" + ints[ints.length - 1]);
        super.run();
    }
}
