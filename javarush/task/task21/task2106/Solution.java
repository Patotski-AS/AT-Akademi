package com.javarush.task.task21.task2106;

import java.util.Date;
import java.util.Objects;

/*
Ошибка в equals/hashCode
Исправьте ошибки реализаций методов equals и hashCode для класса Solution.
*/
public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;
        Solution solution1 = (Solution) o;
       return  (Objects.equals(solution1.anInt, anInt) &&
                Objects.equals(solution1.string, string) &&
                Objects.equals(solution1.aDouble, aDouble) &&
                Objects.equals(solution1.date, date) &&
                Objects.equals(solution1.solution, solution));
    }

    @Override
    public int hashCode(){
      return   Objects.hash(anInt,string,aDouble,date,solution);
    }

    public static void main(String[] args) {
        Solution solution1 = new Solution(12, "qwerty", 22.52, new Date(22 / 02 / 22), null);
        Solution solution2 = new Solution(12, "qwert", 22.52, new Date(22 / 02 / 22), null);

        System.out.println(solution1.equals(solution2));
    }
}






























