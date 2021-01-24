package com.javarush.task.task07.task0717;

//1. Введи с клавиатуры 10 слов в список строк.
//2. Метод doubleValues должен удваивать слова по принципу:
//"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//3. Выведи результат на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));




        for (int i = 0; i < 3; i++) {
            list.add(bufferedReader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String s:result) {
            System.out.println(s);
        }
    // Вывести на экран result
}

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int a = list.size();
        for (int i = 0; i < a; i++) {
 //           list.add(i+1,list.get(i));
            list.add(list.get(0));
            list.add(list.get(0));
            list.remove(0);
        }
            //напишите тут ваш код
            return list;
        }
    }






























