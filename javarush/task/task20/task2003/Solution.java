package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
Знакомство с properties
Метод main() считывает имя файла с консоли и заполняет runtimeStorage данными из файла.
В методах save() и load() реализуй логику записи в файл и чтения из файла для карты runtimeStorage.
Файл должен быть в формате .properties. Комментарии в файле можно игнорировать.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
*/
public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        Properties prop = new Properties();
        prop.putAll(runtimeStorage);
        prop.store(outputStream,null);
//        PrintWriter writer = new PrintWriter(outputStream);
//        for (Map.Entry entry:runtimeStorage.entrySet()){
//            writer.println(entry.getKey() + " : " +  entry.getValue());
//        }
//        writer.close();
        //напишите тут ваш код
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties prop = new Properties();
        prop.load(inputStream);
        prop.forEach((k,v)->runtimeStorage.put(k.toString(),v.toString()));
//        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//            while (reader.ready()){
//                String [] strings = reader.readLine().split(":");
//                runtimeStorage.put(strings[0].trim(),strings[1].trim());
//            }
//            reader.close();
        //напишите тут ваш код
    }

    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}






























