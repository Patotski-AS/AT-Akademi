package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("name1", dateFormat.parse("AUGUST 1 2019"));
        map.put("name2", dateFormat.parse("DECEMBER 1 2019"));
        map.put("name3", dateFormat.parse("FEBRUARY 1 2019"));
        map.put("name4", dateFormat.parse("JANUARY 1 2019"));
        map.put("name5", dateFormat.parse("JULY 1 2019"));
        map.put("name6", dateFormat.parse("JUNE 1 2019"));
        map.put("name7", dateFormat.parse("MARCH 1 2019"));
        map.put("name8", dateFormat.parse("NOVEMBER 1 2019"));
        map.put("name9", dateFormat.parse("OCTOBER 1 2019"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> x = iterator.next();
            Date date = x.getValue();
            if ( date.getMonth()>=5 && date.getMonth()<=7)
               iterator.remove();
        }
    }

    public static void main(String[] args) throws ParseException {
    removeAllSummerPeople(createMap());

    }
}






























