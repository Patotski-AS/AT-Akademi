package com.itacademy.javacore.homeWork.homeWork15.task1;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/*
Выполнить следующие пункты с DateTime API:
Получить текущую дату, вывести дату следующего дня.
Получить текущую дату, вывести дату, которая будет через 5 недель.
Получить текущую дату, вывести дату, которая была 2 месяца назад.
Получить текущее время, вывести время, которое будет через 12 часов.
Получить последний день текущего месяца.
Найти сколько дней осталось в этом году.
Вывести дату в формате January 15 2021.
Вывести дату в формате 15 Jan 2021.
Вывести дату в формате 15.01.21.
Вывести время в формате 15.01.21 20:00.
Вывести время в формате 1-15-2021 20:00:00.000.
Вывести время в формате 15.01.2021 20-00-00.
*/
public class Main {
    public static void main(String[] args) {
       LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Текущая дата:\t" + dateTime.toLocalDate());
        System.out.println("Дата следующего дня:\t" + dateTime.toLocalDate().plusDays(1));
        System.out.println("Дата которая была 2 месяца назад:\t" + dateTime.toLocalDate().minusMonths(2));
        System.out.println("Время, которое будет через 12 часов:\t" + dateTime.toLocalTime().plusHours(12));
        System.out.println("Последний день текущего месяца:\t" +  dateTime.toLocalDate().with(TemporalAdjusters.lastDayOfMonth()));
        LocalDate date = dateTime.toLocalDate().with(TemporalAdjusters.lastDayOfYear());
        Period period = dateTime.toLocalDate().until(date);
        System.out.println("До конца года осталось:\t" +  period.getDays() + " дней");
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MMMM dd uuu", Locale.US)));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd MMM uuu", Locale.US)));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd.MM.uuu", Locale.US)));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd.MM.uuu HH:mm", Locale.US)));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("M-d-uuu HH:mm:ss.SSS", Locale.US)));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd.MM.uuu HH-mm-ss", Locale.US)));
    }
}
