package com.itacademy.javacore.homeWork.homeWork11.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer extends Thread {
    private final File file ;

    public Writer(String path) {
        file = new File(path);
    }

    @Override
    public void run() {
       try (FileWriter writer = new FileWriter(file)) {
           sleep(3000);
           for (int i = 0; i < 10; i++) {
               writer.write((int)(Math.random()*50+1) + " ");
           }
       } catch (IOException | InterruptedException e) {
           e.printStackTrace();
       }
    }
}
