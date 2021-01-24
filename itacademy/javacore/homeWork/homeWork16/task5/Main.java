package com.itacademy.javacore.homeWork.homeWork16.task5;

import com.itacademy.javacore.homeWork.homeWork16.task5.recepients.MailRecipient1;
import com.itacademy.javacore.homeWork.homeWork16.task5.recepients.MailRecipient2;
import com.itacademy.javacore.homeWork.homeWork16.task5.recepients.MailRecipient3;

/**
 * (*- необязательная задача) Паттерн Observer.
 * Разработать систему Почтовое отделение.
 * Из издательства в почтовое отделение поступают издаваемые газеты и журналы.
 * Почтовое отделение отправляет полученные печатные издания соответствующим подписчикам.
 */
public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();

        MailRecipient1 recipient1 = new MailRecipient1("Вася");
        MailRecipient2 recipient2 = new MailRecipient2("Коля");
        MailRecipient3 recipient3 = new MailRecipient3("Антон");

        postOffice.addMail(recipient1);
        postOffice.addMail(recipient2);
        postOffice.addMail(recipient3);
        postOffice.addMail(recipient2);
        postOffice.addMail(recipient1);

        postOffice.sendMail();
    }
}
