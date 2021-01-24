package com.itacademy.javacore.homeWork.homeWork7.task3;

public class PairOfNumbers<T extends Number> extends Pair<T, T> {

    public PairOfNumbers() {
    }

    public PairOfNumbers(T object1, T object2) {
        super(object1, object2);
    }

    public double sum() {
        return getObject1().doubleValue() + getObject2().doubleValue();
    }

    public  T largerItem() {
        return  (getObject1().doubleValue() > getObject2().doubleValue() ? getObject1() : (T) getObject2());

    }

}
