package com.itacademy.javacore.homeWork.homeWork6.task1;

//Класс Квартира содержит список комнат в квартире(bathroom, living room),
// количество жильцов, номер помещения, номер этажа, номер подъезда,
// стоимость аренды квартиры в месяц. Комнаты заданы с помощью enum.

public class Flat extends Premises {
    Room[] rooms;

    public Flat(Tenant tenant, int premisesNumber, int entranceNumber, int floorNumber, int rentPrice) {
        super(tenant, premisesNumber, entranceNumber, floorNumber, rentPrice);
        this.rooms = new Room[]{Room.KITCHEN, Room.BEDROOM, Room.BATHROOM};
        super.waterConsumption = 200;
    }

    public Flat(Tenant tenant, int premisesNumber, int entranceNumber, int floorNumber, int rentPrice, Room room) {
        super(tenant, premisesNumber, entranceNumber, floorNumber, rentPrice);
        this.rooms = new Room[]{Room.KITCHEN, Room.BEDROOM, Room.BATHROOM, room};
        super.waterConsumption = 200;
    }

    public Flat(Tenant tenant, int premisesNumber, int entranceNumber, int floorNumber, int rentPrice, Room room, Room room1) {
        super(tenant, premisesNumber, entranceNumber, floorNumber, rentPrice);
        this.rooms = new Room[]{Room.KITCHEN, Room.BEDROOM, Room.BATHROOM, room,room1};
        super.waterConsumption = 200;
    }

}
