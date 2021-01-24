package com.itacademy.javacore.homeWork.homeWork3;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
//        exercise6();
    }

    public static void exercise1() {
//    Напишите программу, которая сначала выводит все числа от 0 до 20,
//    затем выводит их в обратном(убывающем) порядке,
//    затем выводит все четные числа от 0 до 20 по возрастанию,
//    затем выводит все нечетные числа от 20 до 0 по убыванию.
        int x = 20;
        for (int i = 0; i <= x; i++) {
            if (i == x) {
                System.out.println(i + ". ");
                continue;
            }
            System.out.print(i + ", ");
        }
        for (int i = x; i >= 0; i--) {
            if (i == 0) {
                System.out.println(i + ". ");
                continue;
            }
            System.out.print(i + ", ");
        }
        for (int i = 0; i <= x; i++) {
            if (i == x) {
                System.out.println(i + ". ");
                continue;
            }
            if (i % 2 == 0 && i != 0)
                System.out.print(i + ", ");
        }
        for (int i = x; i >= 0; i--) {
            if (i == 1) {
                System.out.println(i + ". ");
                continue;
            }
            if (i % 2 != 0)
                System.out.print(i + ", ");
        }
    }

    public static void exercise2() {
//        Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
        long x = 7893823445L;
        int result = 0;
        do {
            result += x % 10;
            x = x / 10;
            if (x < 10)
                result += x % 10;
        } while (x > 10);
        System.out.println(result);
    }

    public static void exercise3() {
//        Пользователь вводит с клавиатуры 2 числа: a - начало и b - конец интервала из целых чисел.
//        Выведите числа от a до b включительно, но пропуская числа, которые делятся на 3,
//        а если встретится число, которое делится на 13, то его и числа следующие за ним не надо выводить.
//                Для этой задачи используйте операторы continue и break;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a (начало интервала): ");
        int a = scanner.nextInt();
        System.out.print("Введите число b (конец интервала): ");
        int b = scanner.nextInt();

        while (a <= b) {
            if (a % 3 == 0) {
                a++;
                continue;
            } else if (a == 13)
                break;
            System.out.print(a + " ");
            a++;
        }
        scanner.close();

    }

    public static void exercise4() {
//        Выведите на консоль таблицу умножения для чисел от 2 до 9. Пример вывода:
//        4 6 8 10 12 14 16 18
//        6 9 12 15 18 21 24 27
//        8 12 16 20 24 28 32 36
//        10 15 20 25 30 35 40 45
//        12 18 24 30 36 42 48 54
//        14 21 28 35 42 49 56 63
//        16 24 32 40 48 56 64 72
//        18 27 36 45 54 63 72 81

        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                int x = i * j;
                if (x < 10)
                    System.out.print(x + "  ");
                else
                    System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void exercise5() {
//        (*-выполнять не обязательно) Проверьте, является ли введенное пользователем с клавиатуры натуральное число — простым
//         (не имеющим натуральных делителей, кроме себя самого и 1) .
//         Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно,
//        что число составное и проверку продолжать не нужно). Также учтите, что наименьший делитель натурального числа n,
//         если он вообще имеется, обязательно располагается в отрезке [2; √n].
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое натуральное число: ");
        int x = scanner.nextInt();
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                System.out.println("Число [" + x + "] не является простым");
                return;
            }
        }
        System.out.println("Число [" + x + "] простое ");
        scanner.close();
    }

    public static void exercise6() {
//    (*-выполнять не обязательно) Выведите на экран элементы последовательности чисел Фибоначчи(вычисленную в цикле)
//    от 0-го до 10-го включительно (вычисляя их по формуле).
//     Последовательность чисел Фибоначчи задается так:
//        Fo=0, F1 = 1,Fn = Fn-1 + Fn-2, где n>=2;
//
//        Пример вывода:
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

        int x = 1;
        int y = 1;
        int result = 1;
        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                System.out.print(0);
                continue;
            } else if (i <= 2) {
                System.out.print(", " + result);
                continue;
            }
            System.out.print(", " + (result = x + y));
            x = y;
            y = result;
        }
    }

}