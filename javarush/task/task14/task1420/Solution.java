package com.javarush.task.task14.task1420;

/*
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
1.Программа должна считывать две строки
2,Если строки нельзя преобразовать в положительные целые числа, должно возникнуть исключение
3.вывести данные на экран
4,Программа должна выводить на экран НОД чисел, считанных  с клавиатуры

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        if (x > 0 && y > 0)
            System.out.println(calculationNOD(x, y));
        else
            throw new Exception("Введено отрицательное число");
    }

    public static int calculationNOD(int x, int y) {
        int number = 0;
        if (x < y) {
            number = y;
            y = x;
            x = number;
        }
        while (x % y != 0) {
            number = x % y;
            x = y;
            y = number;
        }
        return y;
    }
}






























