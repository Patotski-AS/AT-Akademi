package com.javarush.task.task14.task1419;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;
import com.sun.org.apache.bcel.internal.generic.ClassGenException;

import java.nio.channels.CancelledKeyException;
import java.util.ArrayList;
import java.util.List;

/*
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        //1
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        //2
        try {
            int [] ints = new int[2];
            ints[3] = 2;
        } catch (Exception e) {
            exceptions.add(e);
        }
        //3
        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (Exception e) {
            exceptions.add(e);
        }
        //4
        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (Exception e) {
            exceptions.add(e);
        }
        //5
        try {
            int [] ints = new int[-2];
        } catch (Exception e) {
            exceptions.add(e);
        }
        //6
        try {
           String x = null;
            x.length();
        } catch (Exception e) {
            exceptions.add(e);
        }
        //7
        try {
           String x = "Привет";
           Integer.parseInt(x);
        } catch (Exception e) {
            exceptions.add(e);
        }
        //8
        try {
           throw new ClassNotFoundException("Exception8");
        } catch (Exception e) {
            exceptions.add(e);
        }
        //9
        try {
           throw new ClassGenException("Exception9");
        } catch (Exception e) {
            exceptions.add(e);
        }
        //10
        try {
           throw new ClassFormatException("Exception10");
        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}






























