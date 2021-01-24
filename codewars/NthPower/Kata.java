package com.codewars.NthPower;

public class Kata {

    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 2, 2};
        System.out.println(nthPower(array, 3));
    }


    public static int nthPower(int[] array, int n) {
        int x = 0;
        try {
            x = (int) Math.pow(array[n], n);
        } catch (ArrayIndexOutOfBoundsException j) {
            x = -1;
        }
        return x;
    }
}