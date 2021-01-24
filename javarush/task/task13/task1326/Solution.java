package com.javarush.task.task13.task1326;

/*
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String nameFile = bufferedReader.readLine();
      String nameFile = "File1.txt";
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(nameFile)));
        String x = null;
        List<Integer> list = new ArrayList<>();
        while ((x=fileReader.readLine())!=null){
            int q = Integer.parseInt(x);
            if (q%2==0){
               list.add(q);
            }
        }
        Collections.sort(list);
        for (int q : list)
            System.out.println(q);

        fileReader.close();
        // напишите тут ваш код
    }
}






























