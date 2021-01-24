package com.itacademy.javacore.homeWork.homeWork9.task1;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Triangle {
    private static final Logger logger =
            Logger.getLogger(Triangle.class.getName());

   private int a;
   private int b;
   private int c;

    public Triangle(int a, int b, int c) throws TriangleException {
        logger.log(Level.INFO, "Вызов конструктора с параметрами a = " + a + ", b = " + b + " и  c = " + c);
        if (!(a > 0 && b > 0 && c > 0)) {
            logger.log(Level.SEVERE, "Ошибка. Введены не правильные данные");
            throw new TriangleException(a, b, c);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int a) throws TriangleException {
        logger.log(Level.INFO, "Вызов конструктора с  параметром a = " + a);
        if (!(a > 0)) {
            logger.log(Level.SEVERE, "Ошибка. Введены не правильные данные");
            throw new TriangleException(a);
        }
        this.a = b = c = a;
    }

    public Triangle() throws TriangleException {
        this(1, 1, 1);
        logger.log(Level.INFO, "Вызов конструктора без параметров.");

    }

    public int perimeter() {
        logger.log(Level.INFO, "Вызов метода 'perimeter' с параметрами a = " + a + ", b = " + b + " и  c = " + c);
        return a + b + c;
    }

    public double area() {
        logger.log(Level.INFO, "Вызов метода 'area' с параметрами a = " + a + ", b = " + b + " и  c = " + c);
        double p = this.perimeter();
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    //        Равносторонний?
    public boolean equilateral() {
        logger.log(Level.INFO, "Вызов метода 'equilateral' с параметрами a = " + a + ", b = " + b + " и  c = " + c);

        return this.a == this.b && this.b == this.c;
    }

    //        Равнобедренный?
    public boolean isosceles() {
        logger.log(Level.INFO, "Вызов метода 'isosceles' с параметрами a = " + a + ", b = " + b + " и  c = " + c);
        return this.a == this.b || this.b == this.c || this.a == this.c;
    }

    //        Прямоугольный?
    public boolean rectangular() {
        logger.log(Level.INFO, "Вызов метода 'rectangular' с параметрами a = " + a + ", b = " + b + " и  c = " + c);
        int[] array = new int[]{this.a, this.b, this.c};
        Arrays.sort(array);
        return Math.pow(array[2], 2) == Math.pow(array[1], 2) + Math.pow(array[0], 2);
    }


}
