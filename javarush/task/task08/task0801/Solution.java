package com.javarush.task.task08.task0801;

//Создать коллекцию Set (реализация HashSet) с типом элементов String.
//        Добавить в неё 10 строк:
//        арбуз
//        банан
//        вишня
//        груша
//        дыня
//        ежевика
//        женьшень
//        земляника
//        ирис
//        картофель
//
//        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 //       Посмотреть, как изменился порядок добавленных элементов.

/*
Set из растений                                                  
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("арбуз") ;
        stringSet.add("банан") ;
        stringSet.add("вишня") ;
        stringSet.add("груша") ;
        stringSet.add("дыня") ;
        stringSet.add("ежевика") ;
        stringSet.add("женьшень") ;
        stringSet.add("земляника") ;
        stringSet.add("ирис") ;
        stringSet.add("картофель") ;

        for (String s:stringSet)
            System.out.println(s);

    }
}






























