package com.itacademy.javacore.homeWork.homeWork15.task2;


/*Создайте простейший сервис с методом, который выводит на экран текущую дату.
 Сделайте его Singleton и используйте в основном теле программы.
 */
public class Main {
    public static void main(String[] args) {
        CurrentDate date = CurrentDate.newDate();
        date.getDate();
    }

}
