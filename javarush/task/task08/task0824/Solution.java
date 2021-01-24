package com.javarush.task.task08.task0824;

/*
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        Human kids1 = new Human("Kids1",false,12 );
        Human kids2 = new Human("Kids2",true,12  );
        Human kids3 = new Human("Kids3",true,5 );
        Human father = new Human("Father", true, 58,kids1,kids2,kids3);
        Human mother = new Human("Mother", false, 58,kids1,kids2,kids3);
        Human grandFather1 = new Human("GrandFather1", true, 58,father);
        Human grandFather2 = new Human("GrandFather2", true, 58,mother);
        Human grandMother1 = new Human("GrandMother1", false, 58,father);
        Human grandMother2 = new Human("GrandMother2", false, 58,mother);




        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kids1.toString());
        System.out.println(kids2.toString());
        System.out.println(kids3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age , Human ... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = Arrays.asList(children);
        }
        public Human(String name) {
            this.name = name;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}