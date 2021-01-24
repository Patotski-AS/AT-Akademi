package com.itacademy.javacore.homeWork.homeWork8.task1;


//Создать класс Card с полями suit(enum из Hearts, Spades, Clubs, Diamonds) и value(от 6 до Т),
//        реализовать для него методы equals, hashCode. Можно заменить J, Q, K, T на 11,12,13,14, чтобы было проще сравнивать.
//        Создать список и добавить в него карты.
//        Отсортировать карты по возрастанию. Mасти Hearts < Diamonds < Clubs < Spades,
//        значения по возрастанию(масть приоритетнее при сортировке).
//        Для сортировки использовать метод из Collections и Comparator.
//        Перемешать карты(метод из Collections).
//        Удалить повторяющиеся карты с помощью Set.
//        На основе полученной коллекции без дубликатов создать Map<Suit,List<Card>>,
//        содержащий масть в качестве ключа и список карт, который соответствует масти, в качестве значения.


import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(Suit.DIAMONDS, Value.SEX));
        cards.add(new Card(Suit.SPADES, Value.KING));
        cards.add(new Card(Suit.CLUBS, Value.NINE));
        cards.add(new Card(Suit.HEARTS, Value.QUEEN));
        cards.add(new Card(Suit.HEARTS, Value.QUEEN));
        cards.add(new Card(Suit.HEARTS, Value.JACK));
        cards.add(new Card(Suit.SPADES, Value.TEN));
        cards.add(new Card(Suit.DIAMONDS, Value.SEVEN));
        cards.add(new Card(Suit.SPADES, Value.TEN));
        cards.add(new Card(Suit.CLUBS, Value.ACE));
        cards.add(new Card(Suit.CLUBS, Value.ACE));

        System.out.println("Лист добавленных карт: " + "\n" +  cards);

        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSuit().ordinal() - o2.getSuit().ordinal();
            }
        });

        System.out.println("Лист отсортированных карт: " + "\n" +cards);
        Collections.shuffle(cards);
        System.out.println("Лист перемешанных карт: " + "\n" +cards);

        Set set = new HashSet(cards);
        cards = new ArrayList<>(set);
        System.out.println("Лист без повторяющихся карт: " + "\n" +cards);

        Map<Suit,List<Card>> map = new HashMap<>();
        for (Card card:cards){
            if (!map.containsKey(card.getSuit())){
                map.put(card.getSuit(),new ArrayList<Card>());
            }
            map.get(card.getSuit()).add(card);
        }

        System.out.println("HashMap с подопытными картами " + "\n" +map);
    }
}
