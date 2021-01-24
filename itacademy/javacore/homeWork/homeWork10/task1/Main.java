package com.itacademy.javacore.homeWork.homeWork10.task1;

import java.io.File;
import java.util.Date;


//Вывести полное дерево файлов выбранной папки на диске. Если файл является папкой,
//        то открывать его и выводить файлы внутри него. В списке файлов выводить относительный путь к файлу
//        (относительно выбранной папки), размер файла, дату последней модификации.
//        Пример вывода:
//        .\.idea\.gitignore, 184 bytes, Wed Nov 25 20:21:16 MSK 2020
//        ...
//        .\out\production\test\com\hw6\WebSite.class, 287 bytes, Tue Dec 15 10:28:53 MSK 2020
//        .\out\production\test\META-INF\test.kotlin_module, 16 bytes, Tue Dec 15 10:28:52 MSK 2020
//        ...
//        .\src\com\hw6\Main.java, 574 bytes, Sat Dec 19 08:51:21 MSK 2020
//        .\src\com\hw6\VideoBlog.java, 293 bytes, Sun Dec 13 20:42:38 MSK 2020
//        .\src\com\hw6\WebSite.java, 70 bytes, Sun Dec 13 20:42:38 MSK 2020
//        .\test.iml, 437 bytes, Wed Nov 25 20:21:02 MSK 2020


public class Main {
    public static void main(String[] args) {
      String  path = "D:\\JAVA\\RUSH\\src\\com\\itacademy\\javacore\\homeWork\\homeWork10";
        File file = new File(path);
        printTreeFiles(file);
    }

    public static void printTreeFiles(File file) {
        if (file.exists()) {
            if (file.isFile())
                System.out.println(file.getAbsolutePath().replace(file.getParent(), ".")
                        + ", " + file.length() + " bytes, " + new Date(file.lastModified()));
            else {
                System.out.println( file.getAbsolutePath());
                File[] files = file.listFiles();
                for (File file1 : files) {
                    printTreeFiles(file1);
                }
            }
        }
    }
}
