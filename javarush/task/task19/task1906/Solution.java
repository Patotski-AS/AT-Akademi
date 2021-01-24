package com.javarush.task.task19.task1906;

import java.io.*;

/*
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(bufferedReader.readLine());
        FileWriter writer = new FileWriter(bufferedReader.readLine());
//        FileReader reader = new FileReader("D:\\JAVA\\RUSH\\File1.txt");
//        FileWriter writer = new FileWriter("D:\\JAVA\\RUSH\\File2");
       for (int i = 1; reader.ready(); i++) {
           int c = reader.read();
           if (i%2 == 0){
                writer.write(c);
            }
        }

        reader.close();
        writer.close();
        bufferedReader.close();
    }
}






























