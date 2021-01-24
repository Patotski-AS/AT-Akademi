package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //      FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileInputStream inputStream = new FileInputStream("D:\\JAVA\\RUSH\\File1.txt");
        int result = 0;

        while (inputStream.available() > 0) {
            int x = inputStream.read();
            if (result < x)
                result = x;
        }

        System.out.println(result);
        reader.close();
        inputStream.close();
    }
}



