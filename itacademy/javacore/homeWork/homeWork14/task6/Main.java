package com.itacademy.javacore.homeWork.homeWork14.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*(* - со звездочкой)
 Даны арифметическая прогрессия an = a1+(n-1)*d,  где a1=5, d = 3,
 и геометрическая прогрессия bn = b1*q(n-1),      где b1 = 5, q = 3.
 Создать стримы, которые генерируют эти две прогрессии.
  Сгенерировать 10 элементов для каждой.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Stream
                .iterate(1,n->n+1)
                .limit(10)
                .collect(Collectors.toCollection(ArrayList::new));
        List<Integer> arithProgr = list.stream()
                .map(x->(5+(x-1)*3))
                .collect(Collectors.toCollection(ArrayList::new));
       List<Integer> geomProgr = list.stream()
               .map(x->(5*3*(x-1)))
               .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Число" + "\t"+ "Ар.прогр"+ "\t"+ "Геом.прогр");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+ "\t\t"+arithProgr.get(i) + "\t\t\t"+geomProgr.get(i) );
        }

    }
}
