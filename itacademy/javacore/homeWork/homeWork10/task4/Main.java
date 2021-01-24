package com.itacademy.javacore.homeWork.homeWork10.task4;


//Создать объект Person c полями name, surname, age, password(не должно сериализоваться),
//        статическими полем minAllowedge. Сгенерировать 10 объектов класса
//        Person со случайными значениями полей соответствующего типа.
//        С помощью сериализации записать их в файл и считать их оттуда.

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static String path = "D:\\JAVA\\RUSH\\src\\com\\itacademy\\javacore\\homeWork\\homeWork10\\task4\\";

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person("name" + i, "surname" + i, random.nextInt(40) + 18, "qwerty" + random.nextInt()));
        }

        writePerson(personList);
        readPerson(new File(path + "qwerty.bin"));

    }

    public static void writePerson(List<Person> personList) {
        File file = new File(path + "qwerty.bin");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Person person : personList) {
                outputStream.writeObject(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readPerson(File file) {
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person person;
            while (fis.available() > 0) {
                person = (Person) ois.readObject();
                System.out.println(person);
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}