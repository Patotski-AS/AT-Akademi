package com.itacademy.javacore.homeWork.homeWork16.task3.strategy;

public class ChoiceSort implements SortStrategy {
    @Override
    public void sort(int[] ints) {
         /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < ints.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = ints[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < ints.length; j++) {
                //Если находим, запоминаем его индекс
                if (ints[j] < min) {
                    min = ints[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = ints[i];
                ints[i] = ints[min_i];
                ints[min_i] = tmp;
            }
        }

    }
}
