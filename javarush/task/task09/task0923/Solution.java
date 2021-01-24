package com.javarush.task.task09.task0923;

/*
Гласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
//Пример ввода:
//Мама мыла раму.
//
//Пример вывода:
//а а ы а а у
//М м м л р м .
//*/
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String text = bufferedReader.readLine();
//        char[] arrayText = text.toCharArray();
//        List<Character> consonantsArray = new ArrayList<>();
//        List<Character> vowelsArray = new ArrayList<>();
//        for (char x : arrayText) {
//            if (x != ' ') {
//                if (isVowel(x))
//                    vowelsArray.add(x);
//                else consonantsArray.add(x);
//            }
//        }
//        for (char x : vowelsArray)
//            System.out.print( x + " ");
//        System.out.println();
//        for (char x : consonantsArray)
//            System.out.print( x + " ");
//    }
//    // метод проверяет, гласная ли буква
//    public static boolean isVowel(char c) {
//        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
//        for (char d : vowels) {  // ищем среди массива гласных
//            if (c == d) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//









