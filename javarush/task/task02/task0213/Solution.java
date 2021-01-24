package com.javarush.task.task02.task0213;

//Создай объект типа Cat (кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
//        Присвой каждому животному владельца (owner).

/*
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {


        //напишите тут ваш код

        Cat murka =new Cat();
        murka.owner= new Woman();

        Dog bobik =new Dog();
        bobik.owner= new Woman();

        Fish fish=new Fish();
        fish.owner= new Woman();

    }

    public static class Cat {
        public Woman owner;

    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}





























