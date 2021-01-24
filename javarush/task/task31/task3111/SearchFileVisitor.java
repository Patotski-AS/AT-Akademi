package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/*
Давай реализуем настраиваемый поиск файлов в директории.
Просмотри интерфейс java.nio.file.FileVisitor и его базовую реализацию java.nio.file.SimpleFileVisitor.
Во время поиска по дереву файлов с помощью метода Files.walkFileTree(Path start, FileVisitor<? super Path> visitor)
мы используем объект FileVisitor для выполнения необходимых операций над найденными объектами Path.

Наш класс для поиска будет называться SearchFileVisitor и расширять SimpleFileVisitor.

Поиск можно будет выполнять по таким критериям:
- выражение, встречающееся в названии файла (String);
- выражение, встречающееся в содержимом файла (String);
- максимальный и минимальный размер файла (int).
Можно задавать либо один, либо сразу несколько критериев для поиска.

Я в main написал код, который использует готовый SearchFileVisitor для поиска файлов,
тебе осталась совсем легкая задача - выполнить его реализацию.
Подсказка 1: методы get... , set... - это геттеры и сеттеры полей.
Основная логика класса по поиску выполняется в методе visitFile(Path file, BasicFileAttributes attrs).
Подсказка 2: для работы с файлами используй только классы из пакета java.nio.*/


public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        String fileContent = new String(content);
        boolean save = true;

        if (partOfName != null && !file.getFileName().toString().contains(partOfName))
            save = false;

        if (partOfContent != null && !fileContent.toString().contains(partOfContent))
            save = false;

        if (maxSize != 0 && content.length > maxSize)
            save = false;

        if (minSize != 0 && content.length < minSize)
            save = false;

        if (save) foundFiles.add(file.toAbsolutePath());


        return super.visitFile(file, attrs);
    }


    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}