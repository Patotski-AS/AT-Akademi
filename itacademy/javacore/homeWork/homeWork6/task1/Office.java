package com.itacademy.javacore.homeWork.homeWork6.task1;

//Класс Офис содержит название фирмы, владелец фирмы,
// номер помещения,
// номер этажа, номер подъезда, количество работников, стоимость аренды офиса в месяц.

public class Office extends Premises  {

    public Office(Tenant tenant, int premisesNumber, int entranceNumber, int floorNumber, int rentPrice) {
        super(tenant, premisesNumber, entranceNumber, floorNumber, rentPrice);
        super.waterConsumption = 10;
    }

}
