package com.itacademy.javacore.homeWork.homeWork15.task3;

interface PersonBuilder {
    PersonBuilder name(String name);

    PersonBuilder surname(String surname);

    PersonBuilder year(int year);

    Person builder();

}
