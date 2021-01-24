package com.itacademy.javacore.homeWork.homeWork14.task7;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*(* - со звездочкой) Создать список из 10 случайных чисел со значениями от 0 до 20
     и вывести его на консоль. В одной непрерывной цепочке стримов вывести эти числа,
     каждое число n заменить на все числа от 0 до n [пример: 7 => 0, 1, 2, 3, 4, 5, 6, 7],
     вывести новый поток и сохранить его в переменную. Посчитать количество и сумму чисел в этом потоке.
*/
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Stream.generate(() -> new Random()
                .nextInt(20))
                .limit(20)
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println(list+"\n");

        List<Integer> newList = list.stream()
                .flatMapToInt(x -> IntStream.rangeClosed(0, x))
                .boxed()
                .peek(i -> System.out.print(i + " "))
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println("\n");

        System.out.println("Сумма " + newList.stream().count() + " чисел = "
                + newList.stream().reduce(0, Integer::sum));
    }
}
