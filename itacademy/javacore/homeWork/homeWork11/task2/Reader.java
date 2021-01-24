package com.itacademy.javacore.homeWork.homeWork11.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader extends Thread {
    private final File file;

    public Reader(String path) {
        file = new File(path);
    }

    @Override
    public void run() {
        List<Double> integers = new ArrayList<>();
        double result = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s;
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
        System.out.println( result / integers.size());
    }
}
