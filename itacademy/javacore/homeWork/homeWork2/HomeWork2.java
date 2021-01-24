package com.itacademy.javacore.homeWork.homeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
//        exercise6();

    }

    public static void exercise1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:");
        double a = scanner.nextDouble();
        System.out.println("Input the second number:");
        double b = scanner.nextDouble();
        System.out.printf("Sum: %.2f \n", a + b);
        System.out.printf("Difference: %.2f \n", a - b);
        System.out.printf("Product: %.2f\n", a * b);
        System.out.printf("Quotient: %.2f\n", a / b);
        scanner.close();
    }

    public static void exercise2() {
        int a, b, r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите с клавиатуры три числа:");
        System.out.print("Сторона прямоугольного отверстия a = ");
        a = scanner.nextInt();
        System.out.print("Сторона прямоугольного отверстия b = ");
        b = scanner.nextInt();
        System.out.print("Радиус картонки r = ");
        r = scanner.nextInt();

        double d = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        if (d <= 2 * r && d <= 2 * r)
            System.out.println("Прямоуольное отверстие можно закрыть круглой картонкой");
        else
            System.out.println("Прямоуольное отверстие нельзя закрыть круглой картонкой");

        scanner.close();
    }

    public static void exercise3() {
//        Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
        Scanner scanner = new Scanner(System.in);
        int day, month, year;
        System.out.println("Введите три числа: день, месяц и год. ");
        System.out.printf("Введенный день: %02d.%02d.%d\n", day = scanner.nextInt(), month = scanner.nextInt(), year = scanner.nextInt());

        if (month > 12 && day > 31)
            System.out.println("Такой даты не существует!");
        else if (month == 2) {
            if (year % 4 == 0) {
                if (day > 29)
                    System.out.println("Такой даты не существует!");
                else if (day == 29)
                    System.out.printf("Следующий день, после введенного: %02d.%02d.%d", 1, month + 1, year);
                else
                    System.out.printf("Следующий день, после введенного: %02d.%02d.%d", day + 1, month, year);
            } else {
                if (day > 28)
                    System.out.println("Такой даты не существует!");
                else if (day == 28)
                    System.out.printf("Следующий день, после введенного: %02d.%02d.%d", 1, month + 1, year);
                else
                    System.out.printf("Следующий день, после введенного: %02d.%02d.%d", day + 1, month, year);
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (month == 12 && day == 31) {
                System.out.printf("Следующий день, после введенного: %02d.%02d.%d\n", 1, 1, year + 1);
                System.out.println("С НОВЫМ ГОДОМ !!!");
            } else if (day == 31)
                System.out.printf("Следующий день, после введенного: %02d.%02d.%d", 1, month + 1, year);
            else
                System.out.printf("Следующий день, после введенного: %02d.%02d.%d", day + 1, month, year);
        } else {
            if (day == 30)
                System.out.printf("Следующий день, после введенного: %02d.%02d.%d", 1, month + 1, year);
            else if (day > 30)
                System.out.println("Такой даты не существует!");
            else
                System.out.printf("Следующий день, после введенного: %02d.%02d.%d", day + 1, month, year);
        }
        scanner.close();
    }

    public static void exercise4() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое целое число: ");
        int x = Integer.parseInt(reader.readLine());
        System.out.print("Введите второе целое число: ");
        int y = Integer.parseInt(reader.readLine());

        System.out.println("Искючающее ИЛИ для этого числа равно: " + ((~x | ~y) & (x | y)));
        reader.close();
    }

    public static void exercise5() {
        // Координаты вершин треуольника:
        int x1 = 4, y1 = 4;
        int x2 = -2, y2 = 6;
        int x3 = -2, y3 = -4;
        // Координаты точки:
        int x = -1, y = -1;

        int a = (x - x1) * (y2 - y1) - (y - y1) * (x2 - x1);
        int b = (x - x2) * (y3 - y2) - (y - y2) * (x3 - x1);
        int c = (x - x3) * (y1 - y3) - (y - y3) * (x1 - x3);

        if ((a > 0 && b > 0 && c > 0)||(a < 0 && b < 0 && c < 0))
            System.out.println("Точка принадлежит треуольнику");
        else if (a == 0 || b == 0 || c == 0)
            System.out.println("Точка находится на стороне треуольника");
        else
            System.out.println("Точка не принадлежит треуольнику");

    }

    public static void exercise6() {
//        Вы планируете вложить сумму денег s с годовой процентной ставкой x%.
//        Эти числа вводятся с клавиатуры.
//        Программа считает, сколько денег будет на этом счету через 5 лет.
//        Пример высчитывания процентов: Допустим положили 100 рублей под 5% годовых.
//        Тогда через год там 105 рублей, через 2 года 110,25, через 3 года 115,76, и т.д.

        int s, x;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите сумму денег, которую планируете вложить: ");
        s = reader.nextInt();
        System.out.print(", под процентов в год: ");
        x = reader.nextInt();
        double result = s;

        System.out.printf("После первого года сумма станет: %.2f \n ", (result += result / 100 * x));
        System.out.printf("После второго года сумма станет: %.2f \n ", (result += result / 100 * x));
        System.out.printf("После третьего года сумма станет: %.2f \n ", (result += result / 100 * x));
        System.out.printf("После четвертого года сумма станет: %.2f \n ", (result += result / 100 * x));
        System.out.printf("После пяти лет сумма станет: %.2f ", (result += result / 100 * x));

        reader.close();
    }


}
