package com.itacademy.javacore.homeWork.homeWork6.task1;

//Создать класс Дом, который содержит список помещений, а именно квартир и офисов, в нем,
//        информацию о владельце, годе постройки и количестве этажей.
//Написать метод для подсчета отдельно квартир и офисов в доме.
//        Написать метод, подсчитывающий, сколько воды в день тратит данный дом в среднем,
//        если считать, что жилец тратит 200 л воды, а работник 10 л воды в день.
//        Написать метод, подсчитывающий доход со всех помещений в месяц.


public class House {
    private Premises[] premises;          // список помещений
    private final int year;               //год постройки
    private final int numberOfFloors;     //количество этажей
    private final int numberOfEntrances;  //количество подъездов
    private final int premisesOfFloors;   //количество помещений на этаже


    // в конструкторе создается дом с пустыми помещеними. По умолчанию установил на одном этаже 3 квартиры.
    public House(int year, int numberOfFloors, int numberOfEntrances, int premisesOfFloors) {
        this.year = year;
        this.numberOfFloors = numberOfFloors;
        this.numberOfEntrances = numberOfEntrances;
        this.premisesOfFloors = premisesOfFloors;
        this.premises = new Premises[premisesOfFloors * numberOfFloors * numberOfEntrances];
    }

    //сдаем в аренду
    public void toRent(Premises premises) {
        this.premises[premises.premisesNumber - 1] = premises;
    }

    //подсчет офисов
    public int numberOfOffices() {
        int count = 0;
        for (Premises x : premises)
            if (x instanceof Office)
                count++;
        return count;
    }

    //подсчет квартир
    public int numberOfFlats() {
        int count = 0;
        for (Premises x : premises)
            if (x instanceof Flat)
                count++;
        return count;
    }

    //подсчет пустых помещений
    public int numberOfPremises() {
        int count = 0;
        for (Premises x : premises)
            if (x == null)
                count++;
        return count;
    }


    // подсчет сколько воды в день тратит данный дом
    public int calculationWater() {
        int result = 0;
        for (Premises x : premises) {
            if (x != null)
                result += x.waterConsumption * (x.numberOfPeople + 1); // жильцы (рабочие) + владелец.
        }
        return result;
    }

    //доход со всех помещений в месяц
    public int calculationRent() {
        int result = 0;
        for (Premises x : premises) {
            if (x != null)
                result += x.receiveRentalPayment();
        }
        return result;
    }

    // Информация о арендаторе
    public String infoTenant(int premisesNumber) {
        if (premisesNumber > premises.length)
            return "Такого помещени не существует";
        if (premises[premisesNumber - 1] == null)
            return "Помещение №" + premisesNumber + " пустое";
        else
            return premises[premisesNumber - 1].tenant.toString();
    }

    //Информация о доме
    public void infoHouse() {
        for (int i = 0; i < premises.length; i++) {
            if (premises[i] == null)
                System.out.println("Помещение №" + (i+1) + " пустое");
            else if (premises[i] instanceof Office)
                System.out.println("Помещение №" + (i+1) + " офис ," + premises[i].tenant.toString() );
            else if (premises[i] instanceof Flat)
                System.out.println("Помещение №" + (i+1) + " жилая квартира ," + premises[i].tenant.toString() );
        }
    }


    public Premises[] getPremises() {
        return premises;
    }

    public void setPremises(Premises[] premises) {
        this.premises = premises;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfEntrances() {
        return numberOfEntrances;
    }


//    @Override
//    public String toString() {
//        return "House{" +
//                "premises=" + Arrays.toString(premises) +
//                ", year=" + year +
//                ", numberOfFloors=" + numberOfFloors +
//                ", numberOfEntrances=" + numberOfEntrances +
//                '}';
//    }
}
