package com.itacademy.javacore.homeWork.homeWork16.task5.recepients;


/**
 * конкретный класс, который реализует интерфейс Observer.
 */
public class MailRecipient1 implements Recipients {
    String name;

    public MailRecipient1(String name) {
        this.name = name;
    }

    @Override
    public void getMail() {
        System.out.println(name + " получил письмо");

    }
}
