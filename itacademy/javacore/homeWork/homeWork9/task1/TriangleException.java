package com.itacademy.javacore.homeWork.homeWork9.task1;

import java.util.HashMap;
import java.util.Map;

public class TriangleException extends Exception {
   private Map<String,Integer> map = new HashMap<>();

    public TriangleException(int a) {
        if (a <= 0)
            map.put("a", a);
    }

    public TriangleException(int a, int b, int c) {
        if (a<=0)
            map.put("a",a);
        if (b<=0)
            map.put("b",b);
        if (c<=0)
            map.put("c",c);
    }

    @Override
    public String getMessage() {
        return "Такого треугольника не существует,отрицательная длина стороны не возможна. " +
                " \n Не правильно введены: " + map.toString()  ;
    }

}
