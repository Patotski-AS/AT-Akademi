package com.itacademy.javacore.homeWork.homeWork15.task4.maker;

import com.itacademy.javacore.homeWork.homeWork15.task4.figure.Pentacub_I;
import com.itacademy.javacore.homeWork.homeWork15.task4.figure.Pentacubs;

public class MakerPentacub_I implements FigureMaker{
    @Override
    public Pentacubs createPentacub() {
        return new Pentacub_I();
    }
}
