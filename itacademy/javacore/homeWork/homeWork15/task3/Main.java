package com.itacademy.javacore.homeWork.homeWork15.task3;

/*Создайте класс Person с полями: имя, фамилия, год рождения.
 Реализуйте у этого класса паттерн Builder(Строитель).
  Введите поля с клавиатуры и заполните объект класса Person с помощью паттерна Строитель.
 */
public class Main {
    public static void main(String[] args) {
Person person = new NewPersonBuilder()
        .surname("Иванов")
        .name("Иван")
        .year(1789)
        .builder();
        System.out.println(person);
    }


}
