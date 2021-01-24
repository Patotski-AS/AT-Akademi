package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/*
Находим все файлы
 Реализовать логику метода getFileTree, который должен в директории root найти список всех файлов включая вложенные.
Используй очередь, рекурсию не используй.
Верни список всех путей к найденным файлам, путь к директориям возвращать не надо.
Путь должен быть абсолютный.
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> strings = new ArrayList<>();
        Path paths = Paths.get(root);

        SimpleFileVisitor <Path> simpleFileVisitor = new SimpleFileVisitor<Path>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (attrs.isRegularFile() && !file.toString().endsWith(".java"))
                    strings.add(file.toFile().getAbsolutePath());
                return FileVisitResult.CONTINUE;
            }
        };
        Files.walkFileTree(paths,simpleFileVisitor);
    return strings;
    }

    public static void main(String[] args) {
        try {
            for (String strings:getFileTree("D:\\JAVA\\RUSH"))
            System.out.println(strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






























