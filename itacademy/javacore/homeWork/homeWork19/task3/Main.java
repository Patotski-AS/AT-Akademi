package com.itacademy.javacore.homeWork.homeWork19.task3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Считать список пончиков из файла example.json и вывести его на консоль.
 * Для этого создать класс, соответствующий объектам, хранимым в json.
 * https://drive.google.com/file/d/1Rp7ZiUnhMaJsiRzHR8eryrZf0Ubt46is/view?usp=sharing
 * (Мы подключали библиотеки jackson-annotations,jackson-core, jackson-databind для работы с json)
 */
public class Main {
    public static void main(String[] args) {
        String file = "D:\\JAVA\\JAVA\\src\\com\\itacademy\\javacore\\homeWork\\homeWork19\\task3\\example.json";
        try {
          readerJson(file).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Donut> readerJson(String file) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get(file));
        ObjectMapper objectMapper = new ObjectMapper();
        return Arrays.asList(objectMapper.readValue(jsonData, Donut[].class));
    }

}

