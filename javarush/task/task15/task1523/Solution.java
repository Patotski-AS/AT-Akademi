package com.javarush.task.task15.task1523;

/*
Перегрузка конструкторов
1. В классе Solution создай 4 конструктора с разными модификаторами доступа.
2. В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
3. Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
4. Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3
конструктора с различными модификаторами доступа(все кроме private).
*/

public class Solution {

    Solution(){}

    public Solution(int a){}

    protected Solution( int a,int b){}

    private Solution(int a,int b, int c){}



    public static void main(String[] args) {

    }
}































