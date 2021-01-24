package com.itacademy.javacore.homeWork.homeWork6.task1;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//"строим" пусой дом
        House house = new House(2020, 2, 2, 3);

        Tenant tenant1 = new Tenant("Name1", "Surname1", 55, 3);
        Tenant tenant2 = new Tenant("Name2", "Surname2", 34, 7);
        Tenant tenant3 = new Tenant("Name3", "Surname3", 41, 5);
        Tenant tenant4 = new Tenant("Name4", "Surname5", 35, 4);
        Tenant tenant5 = new Tenant("Name5", "Surname5", 36, 1);

////сдаем в аренду пустые помещения
        house.toRent(new Flat(tenant1, 1, 1, 1, 300));
        house.toRent(new Office(tenant2, 5, 1, 2, 700));
        house.toRent(new Office(tenant3, 3, 1, 1, 700));
        house.toRent(new Flat(tenant4, 10, 2, 2, 400, Room.CHILDREN_ROOM));
        house.toRent(new Flat(tenant5, 12, 2, 2, 500, Room.CHILDREN_ROOM, Room.LIVING_ROOM));

        System.out.println("Количество жилых квартир в доме    : " + house.numberOfFlats());
        System.out.println("Количество офисов в доме           : " + house.numberOfOffices());
        System.out.println("Количество пустых помещений в доме : " + house.numberOfPremises());
        System.out.println("Данный дом тратит в день           : " + house.calculationWater() + " л. воды");
        System.out.println("Доход со всех помещений в месяц    : " + house.calculationRent() + " $");
        System.out.println();
////инфрмация о владельце конкретной квартиры
        System.out.println(house.infoTenant(1));
//инфрмация о всех помещениях в доме и их владельцах
        System.out.println("\n Инфомация о доме:");
        house.infoHouse();
//
//


    }
}
