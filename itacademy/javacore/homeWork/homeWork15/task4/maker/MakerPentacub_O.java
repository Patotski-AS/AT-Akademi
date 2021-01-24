package com.itacademy.javacore.homeWork.homeWork15.task4.maker;

import com.itacademy.javacore.homeWork.homeWork15.task4.figure.Pentacub_O;
import com.itacademy.javacore.homeWork.homeWork15.task4.figure.Pentacubs;

public class MakerPentacub_O implements FigureMaker{
    @Override
    public Pentacubs createPentacub() {
        return new Pentacub_O();
    }
}
