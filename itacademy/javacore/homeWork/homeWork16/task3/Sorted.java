package com.itacademy.javacore.homeWork.homeWork16.task3;


import com.itacademy.javacore.homeWork.homeWork16.task3.strategy.*;

/**
 * Context task
 */
public class Sorted {
    private SortStrategy strategy;

    public void setSorted(NameSorted nameState) {
        switch (nameState) {
            case BUBBLE:
                strategy = new BubbleSort();
                break;
            case CHOICE:
                strategy = new ChoiceSort();
                break;
            case INSERT:
                strategy = new InsertSort();
                break;
            case HOARE:
                strategy = new HoareSort();
                break;
            case STANDARD:
                strategy = new StandardSort();
                break;
        }
    }

    public void sort(int[] ints) {
        this.strategy.sort(ints);
    }

}
