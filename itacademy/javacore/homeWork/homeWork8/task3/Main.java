package com.itacademy.javacore.homeWork.homeWork8.task3;



//Элементы целочисленного массива записать в очередь.
//        Написать функцию извлечения элементов из очереди до тех пор,
//        пока первый элемент очереди не станет четным.

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int[] ints = new int[]{23, 11, 19, 21, 3, 35, 31, 11, 16, 17, 39, 33, 19, 35, 301, 49, 11, 23, 17, 3, 33};
        for (int i = 0; i < ints.length; i++) {
            queue.add(ints[i]);
        }
        System.out.println(queue);

        while (queue.size()>0){
            if (queue.element()%2==0)
                break;
            else
            System.out.print(queue.poll() +" ");
        }
    }
}
