package com.javarush.task.task12.task1218;

/*
Есть, летать и двигаться
Есть public интерфейсы CanFly(летать), CanMove(передвигаться), CanEat(есть).
Добавь эти интерфейсы классам Dog(собака) - передвигаться и есть, Car(автомобиль) - передвигаться,
Duck(утка) - передвигатьсяб летать и есть, Airplane(самолет) - передвигаться и летать.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Duck implements CanEat, CanMove, CanFly {
        public void move() {
        }

        public void eat() {
        }

        public void fly() {
        }
    }

    public class Car implements CanMove {
        public void move() {
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}






























