package com.itacademy.javacore.homeWork.homeWork15.task4;

import com.itacademy.javacore.homeWork.homeWork15.task4.figure.*;
import com.itacademy.javacore.homeWork.homeWork15.task4.maker.*;

import java.util.Random;

/*Использовать паттерн Factory Method. Создать класс фигуры игры «тетрис»,
 который хранит цвет фигуры и двумерный массив 2*4,
 в котором заполненные квадраты отмечены 1, а пустые 0.
  Сделать класс-фабрику для производства фигур и фабричные методы для каждой из этих фигур.
 Реализовать процесс случайного выбора фигуры из этого конечного набора фигур.

Эти фигуры, соответственно хранят массивы:
0000	1000	0001	11	0110	0100	1100
1111	1110	0111 	11	1100	1110	0110
*/
public class FactoryTetromino {

    public static void main(String[] args) {

       //Сделал немного не по условию: заменил массив чисел, который визуализирует фигуру, на массив строк.
       //Надеюсь это не будет считаться ошибкой)))

        MyRandom<Tetromino> random = (Tetromino... a) -> a[new Random().nextInt(a.length)];

        FigureMaker figureMaker = createTetramino(random
                .method(Tetromino.I, Tetromino.J, Tetromino.L, Tetromino.O, Tetromino.S, Tetromino.T, Tetromino.Z));
        Pentacubs pentacubs = figureMaker.createPentacub();
        pentacubs.print();
    }

    static FigureMaker createTetramino(Tetromino tetromino) {
        FigureMaker figureMaker = null;
        switch (tetromino) {
            case I:
                figureMaker = new MakerPentacub_I();
                break;
            case J:
                figureMaker = new MakerPentacub_J();
                break;
            case L:
                figureMaker = new MakerPentacub_L();
                break;
            case O:
                figureMaker = new MakerPentacub_O();
                break;
            case S:
                figureMaker = new MakerPentacub_S();
                break;
            case T:
                figureMaker = new MakerPentacub_T();
                break;
            case Z:
                figureMaker = new MakerPentacub_Z();
                break;
        }
        return figureMaker;
    }
}
