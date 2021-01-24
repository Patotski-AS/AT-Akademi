package com.javarush.task.task09.task0902;

/*
И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
//        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}





























