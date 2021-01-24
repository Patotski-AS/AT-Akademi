package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
CrUD - Create, Update, Delete.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -і:
Миронов м 15-Apr-1990

*/


public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                } else if (args[2].equals("ж")) {
                    allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                }
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                //  -u id name sex bd
                //  -u - обновляет данные человека с данным id
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                if (args[3].equals("м"))
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                else if (args[3].equals("ж"))
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));
                break;
            case "-d":
                // -d - производит логическое удаление человека с id, заменяет все его данные на null
                // -d id
                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                break;
            case "-i":
                //-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
                Person person = allPeople.get(Integer.parseInt(args[1]));
                String sex = null;
                if (person.getSex().equals(Sex.MALE))
                    sex = "м";
                else if (person.getSex().equals(Sex.FEMALE))
                    sex = "ж";

                System.out.println(person.getName() + " " + sex + " " + new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH).format(person.getBirthDate()));
                break;
        }
        //start here - начни тут
    }
}





























