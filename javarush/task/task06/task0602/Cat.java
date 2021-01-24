package com.javarush.task.task06.task0602;

/*
Пустые кошки, пустые псы
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
"A Cat was destroyed"
"A Dog was destroyed"
*/

public class Cat {

    protected void finalize() {
        System.out.println("A Cat was destroyed");
    }

    public static void main(String[] args) {

    }

    //напишите тут ваш код

}

class Dog {

    protected void finalize() {
        System.out.println("A Dog was destroyed");
    }

    //напишите тут ваш код
}





























