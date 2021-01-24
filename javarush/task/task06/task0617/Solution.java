package com.javarush.task.task06.task0617;

//1. В классе Solution создать public static класс Idea.
//2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку.
//3. В классе Solution создай статический метод public void printIdea(Idea idea),
// который будет выводить на экран описание идеи - это то, что возвращает метод getDescription().


/*
Блокнот для новых идей
*/



public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        String text;

        public String getDescription() {
           return  "Good idea";

        }
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }
    //напишите тут ваш код
}






























