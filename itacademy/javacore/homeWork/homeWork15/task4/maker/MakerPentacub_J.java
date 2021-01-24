package com.itacademy.javacore.homeWork.homeWork15.task4.maker;

import com.itacademy.javacore.homeWork.homeWork15.task4.figure.Pentacub_J;
import com.itacademy.javacore.homeWork.homeWork15.task4.figure.Pentacubs;

public class MakerPentacub_J implements FigureMaker{
    @Override
    public Pentacubs createPentacub() {
        return new Pentacub_J();
    }
}
