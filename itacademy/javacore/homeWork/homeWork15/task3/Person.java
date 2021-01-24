package com.itacademy.javacore.homeWork.homeWork15.task3;

public class Person {
    private String name;
    private String surname;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person{" +
                (getSurname() == null ? "" : surname) + "," +
                (getName() == null ? "" : name) + "," +
                (getYear() == 0 ? "" : year) +
                '}';
    }
}

