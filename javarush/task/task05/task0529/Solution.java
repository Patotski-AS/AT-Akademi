package com.javarush.task.task05.task0529;

//Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
//Вывести на экран полученную сумму.

//Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:

//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//while (true)
//{
//	String s = buffer.readLine();
//	if (s.equals("exit"))
//		break;
//}

/*
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            String s = bufferedReader.readLine();
            if (s.equals("сумма")) {
                break;
            } else sum += Integer.parseInt(s);
        }
        System.out.println(sum);
        //напишите тут ваш код

    }
}





























