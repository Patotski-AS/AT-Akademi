package com.itacademy.javacore.homeWork.homeWork9.task2;

//Взять домашнее задание 7.2 про гараж и транспортные средства.
//        Добавить класс грузовик Truck, унаследованный от Vehicle.
//        Добавить поля ширина и длина  (double в метрах) в класс Vehicle и Garage.
//        Создать исключение для ситуации “не подходящее транспортное средство”,
//        унаследовать от него два  исключения 1-“не совпадают габариты”,  2-“нельзя поставить грузовик”.
//        Отдельно создать исключение для ситуации “гараж занят”. (всего 4 исключения)
//        Бросать эти исключения при установке ТС в гараж. ТС можно поставить в гараж, если гараж не занят,
//        оно не грузовик и его длина/ширина меньше длины/ширины гаража как минимум на 1 метр.
//        Если System.currentTimeMillis()%3 == 0, то бросать исключение “не подходящее транспортное средство”.
//        В main написать программу с этими классами. При обработке исключений “не совпадают габариты” и “гараж занят”,
//        выводить “Найти другой гараж”. При обработке исключения “нельзя поставить грузовик”  выводить “Уехать”.
//        При обработке исключения “не подходящее транспортное средство”  выводить “Подождать сторожа”.
//

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("MAN","White",2.5,10);
        Car car1 = new Car("car 1","color",1.5,2.5);
        Car car2 = new Car("car 2","color",1.8,3);
        Car car3 = new Car("car 3","color",2,4.5);

        Garage garage1 = new Garage(2,4);
        Garage garage2 = new Garage(2,3);
        Garage garage3 = new Garage(2,4);

        try {
//            garage1.park(car1);
//            garage2.park(car3);
            garage1.park(car2);
            garage3.park(truck);

        }catch (LargeDimensionsException e){
            System.out.println( e.getMessage("Найти другой гараж"));
        }catch (TruckException t){
            System.out.println(t.getMessage("Уехать"));
        }catch (UnsuitableVehicleException u ){
            System.out.println(u.getMessage("Подождать сторожа"));
        }catch (GarageException g){
            System.out.println(g.getMessage("Найти другой гараж"));
        }



    }
}
