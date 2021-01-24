package com.itacademy.javacore.homeWork.homeWork6.task1;

//владелец

public class Tenant {
    private String name;
    private String surname;
    private int age;
    private int numberOfPeople;

    public Tenant(String name, String surname, int age, int numberOfPeople) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numberOfPeople = numberOfPeople;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "Владелец (" + surname +
                " " + name +
                ", " + age +
                " лет , количество проживающих (работающих) с ним " + numberOfPeople + " человек) ";
    }
}
