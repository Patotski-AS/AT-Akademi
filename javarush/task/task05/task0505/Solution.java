package com.javarush.task.task05.task0505;

//Создать три кота используя класс Cat.
//Провести три боя попарно между котами.
//Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
//Результат каждого боя вывести на экран c новой строки.

/*
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat bars = new Cat("Barsik",5,10,20);
        Cat murs = new Cat("Mursik",3,8,27);
        Cat wasya = new Cat("Wasiliy",6,15,28);
        //напишите тут ваш код

        System.out.println(bars.fight(murs));
        System.out.println(bars.fight(wasya));
        System.out.println(murs.fight(wasya));


    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
//    Cat bars = new Cat("Barsik",5,10,20);
//    Cat murs = new Cat("Mursik",3,8,27);
//    Cat wasya = new Cat("Wasiliy",6,15,28);





























