package com.javarush.task.task07.task0704;



//1. Создать массив на 10 чисел.
//2. Ввести с клавиатуры 10 чисел и записать их в массив.
//3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
/*
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array=new int[10] ;

        for(int i =0;i< array.length; i++){
            array[i]=Integer.parseInt(bufferedReader.readLine());
        }

        for (int i= array.length; i>0; i--) {
            System.out.println(array[i-1]);
        }

        }
    }





























