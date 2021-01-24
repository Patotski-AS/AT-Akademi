package com.javarush.task.task14.task1417;

//1. В абстрактном классе Money создай приватное поле amount типа double.
//2. Создай публичный геттер для поля amount(public double getAmount()), чтобы к этому полю можно было получить доступ извне класса Money.


public abstract class Money {

  private double amount;


    public Money(double amount) {
      this.amount=amount;
    }

    public  double getAmount() {
      return amount;
    }

    public abstract String getCurrencyName();
}































