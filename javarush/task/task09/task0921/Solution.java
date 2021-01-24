package com.javarush.task.task09.task0921;

/*
Метод в try..catch
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все
 ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData()  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean x = true;
        List<Integer> list = new ArrayList<Integer>();
        while (x){
            try {
                list.add(Integer.parseInt(bufferedReader.readLine()));
            } catch (IOException c) {
            }
            catch (NumberFormatException e) {
                for (int c : list)
                    System.out.println(c);
                x=false;
            }

        }
        //напишите тут ваш код
    }
}





























