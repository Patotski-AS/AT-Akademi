package com.itacademy.javacore.homeWork.homeWork10.task5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//( * - необязательная задача) Создать 2 файла(в коде),
//        заполненных случайными целыми числами(DataOutput/InputStream).
//        Считать по очереди из каждого файла числа, отсортировать их по возрастанию и записать назад.
//        Снова открыть оба файла, считывать из них числа и записывать их в порядке возрастания в новый файл.
//        Новый файл должен быть текстовым(т. е. не DataOutput/InputStream).
//        (Это алгоритм внешней сортировки слиянием для двух файлов)
public class Main {

    public static void main(String[] args) {
        String path = "D:\\JAVA\\RUSH\\src\\com\\itacademy\\javacore\\homeWork\\homeWork10\\task5\\";
        File file1 = new File(path + "File1.txt");
        File file2 = new File(path + "File2.txt");
        arrayToFile(randomArray(25), file1);
        arrayToFile(randomArray(12), file2);
        sortIntFile(file1);
        sortIntFile(file2);
        unionFile(file1, file2, new File(path + "File3.txt"));
    }


    public static List<Integer> randomArray(int length) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static void arrayToFile(List<Integer> list, File file) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (int x : list) {
                fileWriter.write(x + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void sortIntFile(File file) {
        List<Integer> list = fileToArray(file);
        Collections.sort(list);
        arrayToFile(list, file);
    }

    public static void unionFile(File file1, File file2, File newFile) {
        List<Integer> first = fileToArray(file1);
        List<Integer> second = fileToArray(file2);
        List<Integer> newArray = new ArrayList<>();
        int f = 0, s = 0, count = 0;
        int length = first.size() + second.size();

        for (int i = 0; i < length; ) {
            if (f > first.size() && s > second.size()) {
                break;
            }
            if (f > first.size() - 1) {
                newArray.add(second.get(s++));
            } else if (s > second.size() - 1) {
                newArray.add(first.get(f++));
            } else if (first.get(f) < second.get(s)) {
                newArray.add(first.get(f++));
            } else {
                newArray.add(second.get(s++));
            }
            arrayToFile(newArray, newFile);
            i++;
        }
    }

    public static List<Integer> fileToArray(File file) {
        List<Integer> list = new ArrayList<>();
        try (FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String string = "";
            while ((string = bufferedReader.readLine()) != null) {
                String[] strings = string.trim().split(" ");
                for (String x : strings) {
                    list.add(Integer.parseInt(x));
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return list;

    }

}