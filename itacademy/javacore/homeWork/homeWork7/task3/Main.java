package com.itacademy.javacore.homeWork.homeWork7.task3;


/**
 * Создать generic класс Pair, который может хранить 2 объекта любых двух разных типов, имеет геттеры и сеттеры для них.
 * Унаследовать от этого класса класс PairOfNumbers, который хранит 2 объекта одного числового типа
 * (в Java от Number унаследованы все числа:Integer, Double...).
 * В нем добавить методы double sum(), который складывает значения 2 чисел, и метод T largerItem()
 * , который возвращает элемент с большим значением. (При сравнении и сложении можно использовать Number.doubleValue()).
 * Создать статический метод, который принимает Pair из двух объектов,
 * которые реализуют интерфейс CharSequence (к ним относятся String, StringBuilder, StringBuffer)
 * и выводит их на консоль.
 * В main проверить работу этих классов и создать анонимный класс от Pair, хранящий 2 объекта Boolean,
 * в нем добавить метод and, который будет выполнять операцию && над объектами, и сразу вызвать его и
 * вывести полученное значение.
 * Пример вызова сразу:
 * int perimeterValue = new Shape(){
 * public int perimeter(){
 * return 3;
 * }
 * }.perimeter();
 */

public class Main {

    public static void main(String[] args) {
        PairOfNumbers<Number> pairOfNumbers = new PairOfNumbers<>(25, 10.25);
        System.out.println(pairOfNumbers.sum());
        System.out.println(pairOfNumbers.largerItem().toString());
        Pair.printCharSequence(new Pair<>("qwerty", "qwerty2"));

        boolean a = new Pair<Boolean, Boolean>(true, false) {
            public boolean and() {
                return getObject1() && getObject2();
            }
        }.and();

        System.out.println(a);

    }


}
