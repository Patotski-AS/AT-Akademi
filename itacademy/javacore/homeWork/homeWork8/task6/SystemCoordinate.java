package com.itacademy.javacore.homeWork.homeWork8.task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class SystemCoordinate {
    private List<Point> pointList = new ArrayList<>();
    private Circle circle;

    public SystemCoordinate(List<Point> pointList, int r) {
        this.pointList = pointList;
        circle = new Circle(r);
    }

    public SystemCoordinate(Point point, int r) {
        this.pointList.add(point);
        circle = new Circle(r);
    }

    public PriorityQueue<Point> pointsOfCircle() {
        PriorityQueue<Point> priorityQueue = new PriorityQueue<>(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return (int) (o1.length() - o2.length());
            }
        });
        for (Point point : pointList) {
            if (point.length() <= circle.r) {
                priorityQueue.add(point);
            }

        }
        return priorityQueue;
    }

    private class Circle {
        final private Point point = new Point(0, 0);
        private int r;

        public Circle(int r) {
            this.r = r;
        }
    }


}
