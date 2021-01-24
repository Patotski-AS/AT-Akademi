package com.javarush.task.task13.task1319;

/*
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = bufferedReader.readLine();
//        String nameFile = "D:\\JAVA\\RUSH\\src\\com\\javarush\\task\\task13\\task1319\\1.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile));

        String text = null;
        writer.write((text = bufferedReader.readLine()) + "\n");
        while (!text.equals("exit")) {
            writer.write((text = bufferedReader.readLine()) + "\n");
        }

        writer.close();

//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(nameFile), "UTF-8");
//        int x = 0;
//        while ((x = inputStreamReader.read()) != -1) {
//            System.out.print((char) x);
//        }
//
//        inputStreamReader.close();
        // напишите тут ваш код
    }
}





























