package com.itacademy.javacore.homeWork.homeWork10.task3;


/**
 * Создать файл(в коде), заполненный случайными целыми числами(DataOutput/InputStream).
 * Прочитать его и найти среднее арифметическое чисел из файла.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\JAVA\\JAVA\\src\\com\\itacademy\\javacore\\homeWork\\homeWork10\\task3\\";
        File file = new File(path + "qwerty.txt");
        writerRandomInt(file);
        System.out.printf(" %.2f", averageInt(file));
    }

    public static void writerRandomInt(File file) {
        try (FileWriter writer = new FileWriter(file)) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                writer.write(" " + random.nextInt(100));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double averageInt(File file) {
        List<Double> integers = new ArrayList<>();
        double result = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s = "";
            while ((s = reader.readLine()) != null) {
                String[] strings = s.trim().split(" ");
                for (String s1 : strings) {
                    integers.add(Double.parseDouble(s1));
                }
            }
            for (double x : integers) {
                result += x;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result / integers.size();
    }


}
