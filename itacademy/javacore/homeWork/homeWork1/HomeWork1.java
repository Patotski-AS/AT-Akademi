package com.itacademy.javacore.homeWork.homeWork1;


public class HomeWork1 {
    public static void main(String[] args) {
//1.Вывести на консоль “I like Java!”
        System.out.println("I like Java!");
        System.out.println();

//2.Вывести на консоль значения переменных:

        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean b2 = true;

        System.out.println(b);    // 85
        System.out.println(s);    //22015
        System.out.println(i);    //1000000
        System.out.println(l);    //4294967295
        System.out.println(c);    //a
        System.out.println(f);    //0.25
        System.out.println(d);    //1.234E-5
        System.out.println(b2);   //true

        System.out.println();

// 3.Создать две переменные a и b типа int (a<b), присвоить им значения по своему выбору и
//   вывести на консоль результаты операций сложения, вычитания, умножения,
//   деления, остатка от деления (+, -,*,/,%).

        int a = 3;
        int e = 5;

        System.out.println(a + e);              //8
        System.out.println(a - e);              //-2
        System.out.println(a * e);              //15
        System.out.println((double) a / e);     //0,6
        System.out.println(a % e);              //3

        System.out.println();

// 5.(* - задача со звездочкой, выполнять не обязательно) Задать промежуток времени в переменной в секундах.
//    Вывести его на консоль в часах, минутах и секундах.

        int number = 50000;
        int hours = number / 3600;
        int min = number % 3600 / 60;
        int sec = number % 60;


        System.out.println(hours + " hours, " + min + " min, " + sec + " sec."); //13 hours, 53 min, 20 sec.


    }
}

