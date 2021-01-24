package com.javarush.task.task04.task0422;

//Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int year = Integer.parseInt(bufferedReader.readLine());
        if (year < 18)
            System.out.println("Подрасти еще");
    }
}
