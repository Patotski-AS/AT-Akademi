package com.itacademy.javacore.homeWork.homeWork16.task5;

import com.itacademy.javacore.homeWork.homeWork16.task5.recepients.Recipients;

/**
 * интерфейс, определяющий методы для добавления, удаления и оповещения наблюдателей;
 */
public interface Post {
    void addMail(Recipients recipients);
    void removeMail(Recipients recipients);
    void sendMail();
}
