package com.itacademy.javacore.homeWork.homeWork12.task5;

import java.util.Random;
//(*-необязательная задача) Корабли заходят в порт для разгрузки/загрузки контейнеров.
//        Число контейнеров, находящихся в текущий момент в порту и на корабле,
//        должно быть неотрицательным и не превышающим заданную грузоподъемность судна или вместимость порта.
//        В порту работает несколько причалов. У одного причала может стоять один корабль.
//        Корабль может загружаться у причала, разгружаться или выполнять оба действия. (Корабли будут являться потоками)

public class Main {
    public static void main(String[] args) {
        Port port = new Port(5,10000,4000);
        createShip(100,port);
    }
    public static void createShip(int count,Port port) {
        Random random = new Random();
        for (int i = 0; i < count; i++)
            new Thread(new Ship(port,300,random.nextInt(300)+1), "Ship-" + (i + 1)).start();
    }

}
