package com.itacademy.javacore.homeWork.homeWork7.task3;

import java.sql.SQLOutput;

public class Pair <T,E> {
   private T object1;
   private E object2;

    public Pair() {
    }

    public Pair(T object1, E object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public  static void printCharSequence (Pair  <? extends CharSequence,? extends CharSequence>      pair){
        System.out.println( pair );
    }

    public T getObject1() {
        return  object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public E getObject2() {
        return   object2;
    }

    public void setObject2(E object2) {
        this.object2 = object2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                '}';
    }
}
