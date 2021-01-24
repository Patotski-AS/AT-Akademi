package com.itacademy.javacore.homeWork.homeWork16.task1;

/**
 * Паттерн Composite. Разработать структуру данных для хранения информации о государствах,
 * их административных частях и городах.
 * С использованием паттерна Facade создать класс, с методами "добавить город в административную часть",
 * "добавить административную часть в государство", которые используют методы разработанных ранее классов.
 */

public class Composite {
    public static void main(String[] args) {
        Country belarus = new Country("Беларусия");

        AdminPart brestRegion = new AdminPart("Брестская область");
        AdminPart grodnoRegion = new AdminPart("Гродненская область");
        AdminPart minskRegion = new AdminPart("Минская область");

        AdminPart baranovichiDistrict = new AdminPart("Барановичский район");
        AdminPart pinskDistrict = new AdminPart("Пинский район");
        AdminPart lidaDistrict = new AdminPart("Лидский район");
        AdminPart kleckDistrict = new AdminPart("Клецкий район");
        AdminPart minskDistrict = new AdminPart("Минский район");

        Community minsk = new Community("Минск", 1_000_000);
        Community baranovichi = new Community("Барановичи", 175_000);
        Community pinsk = new Community("Пинск", 46_000);
        Community grodno = new Community("Гродно", 356_900);
        Community kleck = new Community("Клецк", 26_900);

        belarus.add(brestRegion);
        belarus.add(grodnoRegion);
        belarus.add(minskRegion);
        belarus.add(minsk);

        brestRegion.add(baranovichiDistrict);
        brestRegion.add(pinskDistrict);

        minskRegion.add(kleckDistrict);
        minskRegion.add(minskDistrict);

        grodnoRegion.add(lidaDistrict);
        grodnoRegion.add(grodno);

        baranovichiDistrict.add(baranovichi);
        pinskDistrict.add(pinsk);
        kleckDistrict.add(kleck);

        System.out.println(belarus.name + " - " + belarus.countPopulation());
        System.out.println(brestRegion.name + " - " + brestRegion.countPopulation());

    }
}
