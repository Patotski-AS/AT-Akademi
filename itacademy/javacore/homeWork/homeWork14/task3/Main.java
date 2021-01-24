package com.itacademy.javacore.homeWork.homeWork14.task3;


//�������� ����� Person � ������ name, surname, age. ������������ ������ �� ������� � �������� �� 15 �� 30.
//�������� ���� ����������� ������� �������, �������:
//        �������� �������, ������� ������� ������ 21;
//        ������������� �� �� �����;
//        ��������� �� �������, � ����� �� ����� (������������ thenComparing � ������� Comparator);
//        ����� 4 ������ �������;
//        ��������� ��������� �� ������� ��������;
//        ���������� ��� � ���������.

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new LinkedList<>();


        for (int i = 0; i < 20; i++) {
            persons.add(new Person("Name" + i, "Surname" + i+1, new Random().nextInt(15) + 15));
        }

        List<String> newList = persons.stream()
                .filter(e -> e.getAge() < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Person::getSurname))
                .sorted(Comparator.comparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());

        System.out.println();
        System.out.println(newList);


    }
}
