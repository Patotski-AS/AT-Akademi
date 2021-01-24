package com.itacademy.javacore.homeWork.homeWork8.task1;

public enum Suit {
    HEARTS('\u2665'),
    DIAMONDS('\u2666'),
    CLUBS('\u2663'),
    SPADES('\u2660');

    public final char count;

    Suit( char count) {
        this.count = count;
    }
}
