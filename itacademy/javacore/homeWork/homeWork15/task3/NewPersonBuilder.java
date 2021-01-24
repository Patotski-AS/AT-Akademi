package com.itacademy.javacore.homeWork.homeWork15.task3;

public class NewPersonBuilder implements PersonBuilder {
   private Person person = new Person();

    @Override
    public PersonBuilder name(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder surname(String surname) {
        person.setSurname(surname);
        return this;
    }

    @Override
    public PersonBuilder year(int year) {
        person.setYear(year);
        return this;
    }

    @Override
    public Person builder() {
        Person newPerson = person;
         person=new Person();
         return newPerson;
    }
}
