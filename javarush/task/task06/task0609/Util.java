package com.javarush.task.task06.task0609;

//Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
//Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.




/*
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double d = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        return d;
        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}






























