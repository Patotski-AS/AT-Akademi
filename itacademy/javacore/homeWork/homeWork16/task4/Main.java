package com.itacademy.javacore.homeWork.homeWork16.task4;

import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Country;
import com.itacademy.javacore.homeWork.homeWork16.task4.composite_visitor.Locality;
import com.itacademy.javacore.homeWork.homeWork16.task4.visitor.FillingVisitor;
import com.itacademy.javacore.homeWork.homeWork16.task4.visitor.PrintCommunityNameVisitor;
import com.itacademy.javacore.homeWork.homeWork16.task4.visitor.SearchVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * (*- необязательная задача) Паттерн Visitor.
 * Использовать задание 1. Добавить в классы государство,
 * административную часть и город метод accept(Visitor v).
 * Создать список государств. Создать Visitor,
 * который будет для каждого из этих классов выводить государство,
 * которому оно принадлежит (для государства - само государство).
 */
public class Main {
    public static void main(String[] args) {

        List<Country> list ;
        AtomicInteger cont = new AtomicInteger();
        list = Stream.generate(() -> new Country("Country" + cont.getAndIncrement()))
                .peek(i -> i.accept(new FillingVisitor()))
                .limit(4)
                .collect(Collectors.toCollection(ArrayList::new));

        list.forEach(country -> country.accept(new PrintCommunityNameVisitor()));

        System.out.println();
        String s = "Country3_Part0_Community1";
        System.out.println( s + " находится в " + searchName(list, s));

    }

    public static String searchName(List<Country> localities, String searchName) {
        for (Locality locality : localities) {
            SearchVisitor visitor = new SearchVisitor(searchName);
            String name = locality.getName();
            locality.accept(visitor);
            if (visitor.isaBoolean())
                return name;
        }
        return null;
    }


}
