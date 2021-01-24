package com.itacademy.javacore.homeWork.homeWork4;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
    }

    //Проверка
    public static void task1() {

//Создать массив строк и перевернуть его.
//Пример: Если был массив {“Hello” , “world”, “!” }, то должен получиться {“!”, “world”, “Hello”}

        String[] array = new String[]{"Hello", "world", "!"};
        System.out.println(Arrays.toString(invertedArray(array)));
        System.out.println();
    }

    public static void task2() {

//Создать две двумерные матрицы и сложить их.

        int[][] firstMatrix = {{1, 3, 0, 2}, {4, 1, 3, 1}};
        int[][] secondMatrix = {{4, -3, 2, -2}, {-3, 0, 4, 0}};
        System.out.println("Первая матрица:" + Arrays.deepToString(firstMatrix));
        System.out.println("Вторая матрица:" + Arrays.deepToString(secondMatrix));
        System.out.println("Сумма двух матриц" + Arrays.deepToString(sumMatrix(firstMatrix, secondMatrix)));
        System.out.println();
    }

    public static void task3() {

//Реализовать самостоятельно(т.е. не используя Arrays.binarySearch) алгоритм двоичного поиска для отсортированного массива .
//Для предварительной сортировки использовать Arrays.sort.

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{4, 78, 12, 54, 56, 8, 5, 79, 6, 2, 4, 78, 8, 8, 6, 456, 45};
        Arrays.sort(array);
        System.out.println("Отсортипованный массив: " + Arrays.toString(array));
        System.out.print("Введите число для поиска: ");
        int n = scanner.nextInt();
        System.out.println("Результат метода Arrays.binarySearch: " + Arrays.binarySearch(array, n));
        System.out.println("Результат метода newBinarySearch: " + newBinarySearch(array, n));
        scanner.close();
    }

    public static void task4() {

// Создать два одномерных массива целых чисел, отсортировать их. Затем создать массив, который будет содержать элементы этих двух массивов в отсортированном порядке. Из результирующего массива удалить повторяющиеся элементы.
// Пример:
//{3,7,1,8}, {4,3,12} => сортируем => {1,3,7,8}, {3,4,12} => сливаем в один массив => {1,3,3,4,7,8,12} => удаляем дубликаты => {1,3,4,7,8,12}

        int[] firstArray = {3, 7, 1,88, 8, 7,10,3};
        int[] secondArray = {4, 3, 12, 1,2,155,88,92,88,88,88};
        System.out.println("Два подопытных массива: " + Arrays.toString(firstArray) + " и " + Arrays.toString(secondArray));
        System.out.println(Arrays.toString(uniteArray(firstArray, secondArray)));

    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int x = scanner.nextInt();
        System.out.println("Факториал числа [" + x + "] = " + factorial(x));
        scanner.close();
    }

    public static void task6() {

//        Строка вводится с клавиатуры. Проверить, является ли она палиндромом.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово : ");
        String word = scanner.nextLine();
        if (palindrome(word))
            System.out.println("Слово является палиндромом");
        else
            System.out.println("Слово не является палиндромом");

        scanner.close();


    }

    public static void task7() {
//        Написать два цикла выполняющих миллион конкатенаций (сложений) строки “aaabbbccc”.
//        Один с помощью String, другой с помощью StringBuilder. Вывести на экран время выполнения каждого цикла.
//        Простейший способ засечь время - использовать System.currentTimeMillis();
        String str = "aaabbbccc";
        StringBuilder stringBuilder = new StringBuilder(str);
        String strings = str;
        long a = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strings = strings + str;
        }
        System.out.println("Время работы [10 000]  циклов через String :  " + (System.currentTimeMillis() - a) + " миллисекунд");

        a = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append(str);
        }
        System.out.println("Время работы [1 000 000] циклов через StringBuilder :  " + (System.currentTimeMillis() - a) + " миллисекунд");


    }

    public static void task8() {
//        Реализовать одну из сортировок массива самостоятельно .

        int[] array = new int[]{4, 78, 12, 54, 56, 8, 5, 79, 6, 2, 4, 78, 8, 8, 6, 456, 45};
        sortArray(array);
        System.out.println(Arrays.toString(array));

    }

    public static void task9() {
//        Реализовать сложение этих двух чисел.
// Пример: “4234729347923472347239874239874923874923” + “589237842374892374923749723423423” = “4234729937161314722132249163624647298346”
        String a = "546";
        String b = "546";
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
        String newMethod = sumIntString(a, b);
        System.out.println("Сумма двух чисел (мой метод) : " + newMethod);

        //BigInteger использовал для проверки
        BigInteger integer1 = new BigInteger(a);
        BigInteger integer2 = new BigInteger(b);
        String string = String.valueOf(integer1.add(integer2));
        System.out.println("Сумма двух чисел (BigInteger): " + string);


        //проверка
        System.out.println("Проверка через equals:  " + string.equals(newMethod));


    }

    public static void task10() {
//      Напишите программу, которая принимает на вход целое число и переводит его в двоичную систему
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int x = scanner.nextInt();
        System.out.println("Число [" + x + "] в двоичной системе: " + translationBinary(x));
        scanner.close();
    }

    public static void task11() {
//      Напишите программу, которая принимает на вход целое число и переводит его в двоичную систему
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число в двоичной системе: ");
        String x = scanner.nextLine();
        System.out.println("Число [" + x + "] в двоичной системе: " + translationDecimal(x));
        scanner.close();
    }


    public static String[] invertedArray(String[] array) {
        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

    public static int[][] sumMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] sumMatrix = new int[firstMatrix.length][firstMatrix[0].length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return sumMatrix;
    }

    public static int newBinarySearch(int[] array, int numberSearch) {
        int a = 0;
        int b = array.length - 1;
        if (numberSearch < array[a])
            return a - 1;
        else if (numberSearch > array[b])
            return -1 * (array.length + 1);

        while (a <= b) {
            int index = (a + b) / 2;
            if (array[index] == numberSearch)
                return index;
            else if (array[index] > numberSearch)
                b = index - 1;
            else
                a = index + 1;
        }
        return (-1 * (a + 1));

    }

    public static int[] uniteArray(int[] firstArray, int[] secondArray) {
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        int[] uniteArray = new int[firstArray.length + secondArray.length];
        int f = 0, s = 0, count = 0;
        int length = uniteArray.length;
        uniteArray[0] = Math.min(secondArray[0], firstArray[0]);
        for (int i = 1; i < (length - count); ) {
            int a = 0;
            if (s > secondArray.length - 1 && f > firstArray.length - 1)
                break;
            else if (f > firstArray.length - 1) {
                a = secondArray[s++];
            } else if (s > secondArray.length - 1) {
                a = firstArray[f++];
            } else if (firstArray[f] < secondArray[s]) {
                a = firstArray[f++];
            } else if (firstArray[f] > secondArray[s]) {
                a = secondArray[s++];
            } else {
                a = secondArray[f];
                s++;
                f++;
            }
            if (uniteArray[i - 1] == a) {
                count++;
                continue;
            }
            uniteArray[i] = a;
            i++;
        }
        return uniteArray;


//        int count = 0;
//        //Слияние массивов
//        for (int j : firstArray) {
//            uniteArray[count] = j;
//            count++;
//        }
//        for (int j : secondArray) {
//            uniteArray[count] = j;
//            count++;
//        }
//        //Сортировка
//        Arrays.sort(uniteArray);
//        //Удаление повторяющихся элементов
//        count = 0;
//        int length = uniteArray.length;//длина массива без лишних элементов
//        int[] tempArray = new int[uniteArray.length];//временный массив
//
//        for (int i = 0; i < uniteArray.length; i++) {
//            tempArray[count] = uniteArray[i];
//            for (int j = i + 1; j < uniteArray.length; j++) {
//                if (uniteArray[i] == uniteArray[j]) {
//                    count--;
//                    length--;
//                    break;
//                }
//            }
//            count++;
//        }
//        uniteArray = new int[length];
//        for (int i = 0; i < length; i++) {
//            uniteArray[i] = tempArray[i];
//        }
//
//
//
    }

    public static BigInteger factorial(int x) {
        BigInteger result = new BigInteger(String.valueOf(x));
        if (x - 1 <= 0)
            return BigInteger.valueOf(1);
        return result.multiply(factorial(x - 1));
    }

    public static boolean palindrome(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i])
                return false;
        }
        return true;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] > array[j]) {
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }

            }
        }
    }

    public static String sumIntString(String a, String b) {
        StringBuilder sumIntString = new StringBuilder();
        int sum;
        int modulo = 0;
        char[] max;
        char[] min;
//        Перевел строки в масивы char и опредил которая строка длинее.
        if (a.length() <= b.length()) {
            max = b.toCharArray();
            min = a.toCharArray();
        } else {
            max = a.toCharArray();
            min = b.toCharArray();
        }
//        Находим сумму чисел в строке , с конца.
        for (int i = 0; i < min.length; i++) {
            sum = Integer.parseInt(String.valueOf(max[max.length - 1 - i])) + Integer.parseInt(String.valueOf(min[min.length - 1 - i])) + modulo;
            if (sum >= 10) {
                modulo = 1;
                sumIntString.append(sum - 10);
            } else {
                sumIntString.append(sum);
                modulo = 0;
            }
        }
        for (int i = min.length; i < max.length; i++) {
            sum = modulo + Integer.parseInt(String.valueOf(max[max.length - 1 - i]));
            if (sum >= 10) {
                modulo = 1;
                sumIntString.append(sum - 10);
            } else {
                sumIntString.append(sum);
                modulo = 0;
            }
        }
        if (modulo > 0)
            sumIntString.append(modulo);
//        Переворачиваем строку
        max = sumIntString.toString().toCharArray();
        min = new char[max.length];
        for (int i = 0; i < max.length; i++) {
            min[i] = max[max.length - 1 - i];
        }
        return String.valueOf(min);
    }

    public static String translationBinary(int number) {
        StringBuilder str = new StringBuilder();
        while (number >= 2) {
            int x = number % 2;
            number = ((number - x) / 2);
            str.append(x);
        }
        str.append(number);
        return str.reverse().toString();
    }

    public static int translationDecimal(String str) {
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            int b = str.length() - 1 - i;
            x += a * ((int) Math.pow(2, b));
        }
        return x;
    }
}




