package com.itacademy.javacore.homeWork.homeWork10.task6;


import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.io.*;
import java.nio.file.Files;

//( * - �������������� ������) ��������� ����� Java-���������,
//        ������� �� ���� ��� ���� ������������ (// � /* */), ��� ����� public �
//// ���������� ��������� � ������� ������ �������� �� ����� private.
public class Main {
    public static void main(String[] args) {

        // � File.txt - ���������� �����. ���������� File1.txt ��� ��������.

        String path = "D:\\JAVA\\RUSH\\src\\com\\itacademy\\javacore\\homeWork\\homeWork10\\task6\\";

        File fileToCheck = new File(path + "File.txt");
        File file = new File(path + "File1.txt");
        try {
            if (file.exists())
                file.delete();
            file = (Files.copy(fileToCheck.toPath(), file.toPath())).toFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        correctFile(file);
    }

    public static void correctFile(File file) {
        File tempFile = new File("D:\\JAVA\\RUSH\\src\\com\\itacademy\\javacore\\homeWork\\homeWork10\\task6\\TempFile.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile, true));
             FileReader fr = new FileReader(file);
             BufferedReader reader = new BufferedReader(fr)) {
            String string = "";
            while ((string = reader.readLine()) != null) {
                if (string.matches("^(//).*")) {
                    continue;
                }
                if (string.matches("^(/\\*).*")) {
                    while (!(string = reader.readLine()).matches("^(\\*/.*)")) {
                    }
                    continue;
                }
                if (string.contains("public")) {
                    string = string.replace("public", "private");
                    writer.write(string + "\n");
                    continue;
                }
                writer.write(string + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.delete();
        tempFile.renameTo(file);
    }

}
