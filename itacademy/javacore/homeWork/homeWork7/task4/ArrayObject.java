package com.itacademy.javacore.homeWork.homeWork7.task4;

//4) Создать generic class, который хранит массив элементов любого типа, не делать геттеры и сеттеры для массива.
//        Добавить методы: возвращение длины массива, получения элемента по индексу, установки значения элемента по индексу.


import java.util.Arrays;

public class ArrayObject<T> {
    private final T[] array;

    public ArrayObject(int length) {
        array = (T[]) new Object[length];
    }

    public int length(){
        return array.length;
    }

    public T get(int index) {
        return array[index];
    }

    public void add(T object, int index) {
        array[index] = object;
    }


    public static void main(String[] args) {

        ArrayObject<String> stringArrayObject = new ArrayObject<>(5);
        ArrayObject<Integer> integerArrayObject = new ArrayObject<>(2);

        stringArrayObject.length();
        integerArrayObject.length();

        stringArrayObject.add("qwerty",3);
        System.out.println(stringArrayObject.get(3));
        integerArrayObject.add(555,1);
        System.out.println(integerArrayObject.get(1));

        System.out.println(Arrays.toString(stringArrayObject.array));
        System.out.println(Arrays.toString(integerArrayObject.array));

    }


}
