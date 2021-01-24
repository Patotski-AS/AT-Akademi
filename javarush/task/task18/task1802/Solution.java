package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
//        FileInputStream inputStream = new FileInputStream("D:\\JAVA\\RUSH\\File1.txt");
        int result = inputStream.read();

        while (inputStream.available() > 0) {
            int x = inputStream.read();
            if (result > x) result = x;
        }
        System.out.println(result);
        reader.close();
        inputStream.close();

    }
}