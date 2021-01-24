package com.javarush.task.task09.task0922;

/*
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Date date = dateFormat1.parse(bufferedReader.readLine());
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat2.format(date).toUpperCase());

    }
}






























