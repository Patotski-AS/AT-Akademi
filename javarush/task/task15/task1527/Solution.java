package com.javarush.task.task15.task1527;

/*
Парсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        String info = text.substring(text.indexOf('?') + 1);
        String[] infos = info.split("&");
        if (!info.contains("obj")) {
            for (String x : infos) {
                if (x.contains("=")) {
                    int n = x.indexOf("=");
                    System.out.print(x.substring(0, n) + " ");
                } else
                    System.out.print(x + " ");
            }
        } else {
            String s = null;
            for (String x : infos) {
                if (x.contains("=")) {
                    if (x.contains("obj")) {
                        s = x.substring(x.indexOf('=') + 1);
                        System.out.print(x.substring(0, x.indexOf('=')) + " ");
                    } else System.out.print(x.substring(0, x.indexOf('=')) + " ");
                } else System.out.print(x + " ");
            }
            System.out.println();
            doDouble(s);
        }
    }
    //add your code here

    public static void doDouble(String s){
        try {
            Double x = Double.parseDouble(s);
            alert(x);
        } catch (NumberFormatException e){
            alert(s);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}






























