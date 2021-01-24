package com.itacademy.javacore.homeWork.homeWork8.task6;

public class Point {
    private int x;
    private int y;

    protected Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
