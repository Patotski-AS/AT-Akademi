package com.codewars.Recursion_101;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solve(8796203, 7556)));
    }
}

class Solution {

    public static int[] solve(int a, int b) {
        if (a == 0 || b == 0)
            return new int[]{a, b};
        else if (a >= 2 * b)
            return new int[]{a - 2 * b, b};
        else if (b >= 2 * a)
            return new int[]{a, b - 2 * a};
        return new int[0];
    }
}
//class Solution{
//    public static int[] solve(int a, int b) {
//        return a == 0 || b == 0 ? new int[]{a, b} :
//                a >= 2 * b ? solve(a - 2 * b, b) :
//                        b >= 2 * a ? solve(a, b - 2 * a) : new int[]{a, b};
//    }
//}

//class Solution{
//    public static int [] solve(int a, int b){
//        for (int i = 0; i < 24; ++i) {
//            if (b>0) a %= 2 * b;
//            if (a>0) b %= 2 * a;
//        }
//        return new int []{a,b};
//    }
//}