package com.itacademy.javacore.homeWork.homeWork7.task5;

//(* - выполнять не обязательно) Реализовать класс, похожий на LinkedList самостоятельно.
//        Создать класс CustomLinkedList<T>. В нем добавить класс Node<T>, в котором хранить поля Node next, и T value.
//        В классе CustomLinkedList хранить поля Node first, Node last, int length, реализовать методы:
//        add - добавление элемента в конец списка, remove - удаление из конца списка, getLength() - возвращает длину,
//        toString() - выводит все элементы списка, toArray() - возвращает массив элементов списка.
//
//        Организация LinkedList:


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList <Integer> list = new CustomLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove();
        list.remove();
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.addNext(10);
        System.out.println(list);
    }
}
