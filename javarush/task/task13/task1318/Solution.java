package com.javarush.task.task13.task1318;

/*
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

Требования:
1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
*/


import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(nameFile);
        InputStreamReader inputStream = new InputStreamReader(fileInputStream, "UTF-8");
        int x = 0;
        bufferedReader.close();

        while ((x=inputStream.read()) != -1) {
            System.out.print((char)x);
        }
        System.out.println();

        inputStream.close();
        // напишите тут ваш код
    }
}





























