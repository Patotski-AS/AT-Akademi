package com.itacademy.javacore.homeWork.homeWork8.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//( * - необязательная задача) Имеется окружность с радиусом r (0<r<100), вводимым с клавиатуры, и центром в точке(0,0).
//        Создается список точек (x,y), координаты заполняются рандомно 0<x,y<100.
//        Вывести точки, которые лежат внутри окружности в порядке возрастания расстояния от центра.
//        Использовать класс PriorityQueue, созданный на основе списка точек, в качестве приоритета расстояние до центра окружности.


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        List<Point> pointList = new ArrayList<>();
        int numberOfPoint = 30;
        for (int i = 0; i < numberOfPoint; i++) {
            pointList.add(new Point(random.nextInt(100), random.nextInt(100)));
        }
        System.out.println("Рандомный список точек: " + "\n" + pointList);

        System.out.print("Введите радиус круга: ");
        SystemCoordinate systemCoordinate = new SystemCoordinate(pointList, Integer.parseInt(reader.readLine()));


        System.out.println("Точки пренадлежащие кругу: " + systemCoordinate.pointsOfCircle());
        reader.readLine();
    }


}
