package com.itacademy.javacore.homeWork.homeWork8.task7;


//( * - необязательная задача) Два скучающих солдата играют в карточную войну.
//        Их колода состоит ровно из n карт, пронумерованных различными числами от 1 до n.
//        Число n(2 ≤ n ≤ 10) вводится с клавиатуры, карты хранятся в списке(заполнить его числами от 1 до n),
//        который перед использованием надо перемешать (Collections.shuffle).
//        Солдаты делят колоду пополам(если n - нечетное, то у одного из них на одну карту больше).
//        Для хранения их стопок использовать Queue.
//        Правила игры следующие. На каждом ходу происходит сражение.
//        Каждый игрок берет карту с вершины своей стопки и кладет на стол.
//        Тот, у кого значение карты больше, выигрывает в этом сражении, берет обе карты со стола и кладет в низ своей стопки.
//        Точнее говоря, сперва он берет карту противника и кладет в низ своей стопки, затем кладет свою карту в низ своей стопки.
//        Если после какого-то хода стопка одного игрока становится пустой, то он проигрывает, а другой игрок побеждает.
//        Подсчитать, после сколько будет сражений и кто победит. Игра может длится бесконечно, поэтому если прошло больше 106 сражений,
//        то можно сказать, что игра бесконечная и завершить попытки найти победителя.
//        Источник задачи и наглядные примеры здесь:
//        https://codeforces.com/problemset/problem/546/C
//        Разбор задачи и информация про 106 значений здесь:
//        https://codeforces.com/blog/entry/18034
//


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> deckicapt = new ArrayList<>();
        System.out.print("Введите количество карт в колоде: ");
        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            deckicapt.add(i);
        }
        Collections.shuffle(deckicapt);
        Queue<Integer> soldier1 = new LinkedList<>();
        Queue<Integer> soldier2 = new LinkedList<>();
        for (int i = 0; i < deckicapt.size(); i++) {
            if (i < deckicapt.size() / 2)
                soldier1.add(deckicapt.get(i));
            else soldier2.add(deckicapt.get(i));
        }
        int count = 0;
        while (soldier1.size() > 0 && soldier2.size() > 0 && count < 107) {
            int s1 = soldier1.poll();
            int s2 = soldier2.poll();
            System.out.println((count + 1) + " ход  (" + s1 + " - " + s2 + ")");
            if (s1 > s2) {
                soldier1.offer(s1);
                soldier1.offer(s2);
            } else {
                soldier2.offer(s2);
                soldier2.offer(s1);
            }
            count++;
        }
        if (soldier1.size() < soldier2.size())
            System.out.println("Выиграл второй солдат ");
        else System.out.println("Выиграл первый солдат ");
        reader.readLine();
    }


}
