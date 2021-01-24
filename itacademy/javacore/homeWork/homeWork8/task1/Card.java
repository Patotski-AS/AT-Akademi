package com.itacademy.javacore.homeWork.homeWork8.task1;

import java.util.Objects;

public class Card implements Comparable {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && value == card.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public int compareTo(Object o) {
        Card card = (Card) o;
        return this.getValue().ordinal() - card.getValue().ordinal();
    }

    @Override
    public String toString() {
        return "Card {" +
                value.count + " "

                + suit.count +
                '}';
    }
}
