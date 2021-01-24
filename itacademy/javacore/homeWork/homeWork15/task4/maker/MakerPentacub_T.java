package com.itacademy.javacore.homeWork.homeWork15.task4.maker;

import com.itacademy.javacore.homeWork.homeWork15.task4.figure.Pentacub_T;
import com.itacademy.javacore.homeWork.homeWork15.task4.figure.Pentacubs;

public class MakerPentacub_T implements FigureMaker{
    @Override
    public Pentacubs createPentacub() {
        return new Pentacub_T();
    }
}
