package com.javarush.task.task20.task2010;

import java.io.Serializable;

/*
 ак сериализовать что-то свое?
—делайте так, чтобы сериализаци€ класса Object была возможной.
*/
public class Solution {
    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static int stringCount;

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(String[] args) {

    }
}





























