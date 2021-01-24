package com.itacademy.javacore.homeWork.homeWork13.task4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

//Создать класс User с полями  dateOfBirth, firstName, lastName, age, blocked = false.
//        Создать объект этого класса.
//        Попросить пользователя ввести дату рождения.
//        Создать и запустить CompletableFuture, которая спит 5-15 секунд (случайное число от 5 до 15),
//        считает и возвращает, сколько пользователю лет.
//        Сделать callback для этой CompletableFuture, который в зависимости от значения
//        возраста возвращает true если <18 и false, если >=18.
//        Создать callback, который берет этот результат и записывает в user.blocked, ничего не возвращает.
//        Пока все это выполняется, пользователь вводит свое имя и фамилию.
//        Затем ожидается выполнение CompletableFuture. После этого на основании поля
//        blocked пользователю выводится сообщение, заблокирован он или нет.
public class Main {

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getBlocked());
    }

    public static class User {
        private LocalDate dateOfBirth;
        private String firstName;
        private String lastName;
        private int age;
        private boolean blocked = false;
        private CompletableFuture<Void> futureAge;

        public User() {
            filling();
        }

        private void filling() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            System.out.println("Введите дату рождения в формате 01.01.2021 : ");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                dateOfBirth = LocalDate.parse(reader.readLine(), formatter);
                setAge();
                setName();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void setAge() {
             futureAge = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(new Random().nextInt(15000 - 5000) + 5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Period period = Period.between(dateOfBirth, LocalDate.now());
                return period.getYears();
            })
                    .thenApplyAsync(age -> {
                        this.age=age;
                        return age > 18;
                    }).thenAccept(blocked -> this.blocked = blocked);

        }

        private void setName() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Введите имя: ");
            firstName = reader.readLine() ;
                System.out.print("Введите фамилию: " );
                 lastName = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public String getBlocked() {
            try {
                futureAge.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            return ( this.toString() + "\n" + (blocked ? "Пользователь не заблокирован" : "Пользователь  заблокирован"));
        }

        @Override
        public String toString() {
            return firstName + " "
                    + lastName + "\nДата рождения:\t"
                    + dateOfBirth.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")) + "\nВозраст:\t"
                    + age ;
        }
    }
}
