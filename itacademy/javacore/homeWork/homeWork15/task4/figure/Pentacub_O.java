package com.itacademy.javacore.homeWork.homeWork15.task4.figure;

public class Pentacub_O implements Pentacubs {
    private final String color;
    private final String[][] visualization;

    public Pentacub_O() {
        color = "\u001B[103m";
            visualization = new String[][]{{" ","X","X"," "},{" ","X","X"," "}};
    }
    @Override
    public void print() {
        for (String[] ints : visualization) {
            for (int j = 0; j < visualization[0].length; j++) {
                if (ints[j].equals(" "))
                    System.out.print(ints[j]);
                else
                    System.out.print(color + ints[j] + "\u001B[0m");
            }
            System.out.println();
        }
    }
}
