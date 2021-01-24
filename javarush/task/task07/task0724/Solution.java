package com.javarush.task.task07.task0724;

/*
Семейная перепись
 Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так,
 чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...
*/

public class Solution {
    public static void main(String[] args) {

        Human grandfather1 = new Human("grandfather1",true,55);
        Human grandfather2 = new Human("grandfather2",true,55);
        Human grandmother1 = new Human("grandmother1",false,56);
        Human grandmother2 = new Human("grandmother2",false,56);
        Human father = new Human("father",true,33,grandfather1,grandmother1);
        Human mother = new Human("mother",false,33,grandfather2,grandmother2);
        Human kinder1 = new Human("kinder1",true,12,father,mother);
        Human kinder2 = new Human("kinder2",false,12,father,mother);
        Human kinder3 = new Human("kinder3",true,12,father,mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kinder1);
        System.out.println(kinder2);
        System.out.println(kinder3);

        // напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

       public   Human(String name, boolean sex, int age) {
           this.name = name;
           this.sex = sex;
           this.age = age;
       }

       public   Human(String name, boolean sex, int age, Human father, Human mother) {
           this.name = name;
           this.sex = sex;
           this.age = age;
           this.father = father;
           this.mother = mother;
       }
        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}





























