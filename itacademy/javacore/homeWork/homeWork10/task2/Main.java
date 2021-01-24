package com.itacademy.javacore.homeWork.homeWork10.task2;


//Создать файл с текстом(не в коде), сделать для него частотный словарь,
//        т.е. подсчитать количество вхождений каждого слова.
//        Вывести результат на экран. При подсчете учитывать,
//        что слова "Привет", "привет", "привет,"(с любыми знаками препинания)
//        - это вхождения одного и того же слова. (Задание похоже на дз 8.4)

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\JAVA\\RUSH\\src\\com\\itacademy\\javacore\\homeWork\\homeWork10\\task2\\";
        File file = new File(path + "qwerty.txt");
        counterRepeatWorld(file);
    }

    public static void counterRepeatWorld(File file) {
        if (file.exists()) {
            Map<String, Integer> map = new HashMap<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String string = "";
                while ((string = reader.readLine()) != null) {
                    String[] strings = string.trim().split("(\\p{Punct} )| ");
                    for (String x : strings) {
                        if (map.containsKey(x.toUpperCase()))
                            map.put(x.toUpperCase(), map.get(x.toUpperCase()) + 1);
                        else
                            map.put(x.toUpperCase(), 1);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(map);
        }

    }
}
