package com.javarush.task.task07.task0705;

//1. Создать массив на 20 чисел.
//2. Ввести в него значения с клавиатуры.
//3. Создать два массива на 10 чисел каждый.
//4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] arr = new int[20];
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(bufferedReader.readLine());
        }
        int [] arr1 = new int[10];
        int [] arr2 = new int[10];

        for (int i = 0; i <10 ; i++) {
            arr1[i]= arr[i];
            arr2[i]= arr[10+i];
        }

        for (int s:arr2)
            System.out.println(s);

        //напишите тут ваш код
    }
}
                                                  





























