package com.javarush.task.task07.task0706;

//1. Создать массив на 15 целых чисел.
//2. Ввести в него значения с клавиатуры.
//3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
//Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
//4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
//Примечание:
//        дом с порядковым номером 0 считать четным.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] house = new int[5];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < house.length; i++) {
            house[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int even = 1;
        int notEwen = 0;
        int resultEven = house[0];
        int resultNotEven = 0;
        for (int i = 1; i < house.length; i++) {
            if (i % 2 == 0) {
                even++;
                resultEven += house[i];
            } else {
                notEwen++;
                resultNotEven += house[i];
            }
        }
        if (resultEven > resultNotEven) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        //напишите тут ваш код
    }
}






























