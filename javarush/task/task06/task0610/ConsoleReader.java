package com.javarush.task.task06.task0610;

//Сделать класс ConsoleReader, у которого будут 4 статических метода:
//String readString() - читает с клавиатуры строку
//int readInt() - читает с клавиатуры число
//double readDouble() - читает с клавиатуры дробное число
//boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false

//Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.


/*
Класс   ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String x= bufferedReader.readLine();
        return x;

    }

    public static int readInt() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x= Integer.parseInt (bufferedReader.readLine());
        return x;

        //напишите тут ваш ко
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double x= Double.parseDouble (bufferedReader.readLine());
        return x;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean x = Boolean.parseBoolean (bufferedReader.readLine());
        return x;
    }

    public static void main(String[] args) throws Exception {

    }
}






























