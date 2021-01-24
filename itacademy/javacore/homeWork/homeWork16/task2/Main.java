package com.itacademy.javacore.homeWork.homeWork16.task2;


import com.itacademy.javacore.homeWork.homeWork16.task2.state.Established;

/**
 * Паттерн State. Заказ на получение гранта для обучения может находиться
 * в нескольких состояниях: создан, рассматривается, отложен, отклонен, подтвержден,
 * отозван и т. д. Определить логику изменения состояний и разработать модель системы.
 */

public class Main {
    public static void main(String[] args) {
        GrantOrder grantOrder = new GrantOrder("Name");
        grantOrder.setState(new Established());
        grantOrder.currentState();
        grantOrder.yes();
        grantOrder.no();
        grantOrder.yes();
        grantOrder.yes();

    }
}
