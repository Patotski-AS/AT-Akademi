package com.javarush.task.task15.task1507;

/*
ООП - Перегрузка
 Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }
//1
    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
//2
    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
//3
    public static void printMatrix(char m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
//4
    public static void printMatrix(char m, char n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
//5
    public static void printMatrix(byte m, char n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (String) value);
    }
//6
    public static void printMatrix(byte m, long n, Object value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
//7
    public static void printMatrix(long m, char n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (String) value);
    }
//8
    public static void printMatrix(int m, char n, Object value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
//9
    public static void printMatrix(byte m, Integer n, Object value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
//10
    public static void printMatrix(Integer m, char n, Object value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

}






























