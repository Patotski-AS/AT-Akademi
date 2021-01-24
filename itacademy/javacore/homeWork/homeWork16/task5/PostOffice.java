package com.itacademy.javacore.homeWork.homeWork16.task5;

import com.itacademy.javacore.homeWork.homeWork16.task5.recepients.Recipients;

import java.util.LinkedList;
import java.util.List;

/**
 * конкретный класс, который реализует интерфейс Observable;
 */
public class PostOffice implements Post {
    private  List<Recipients> recipients;

    public PostOffice() {
        this.recipients = new LinkedList<>();
    }

    @Override
    public void addMail(Recipients recipient) {
        recipients.add(recipient);
    }

    @Override
    public void removeMail(Recipients recipient) {
        recipients.remove(recipient);
    }

    @Override
    public void sendMail() {
        for (Recipients recipient : recipients) {
            recipient.getMail();
        }
        recipients = new LinkedList<>();
    }
}

