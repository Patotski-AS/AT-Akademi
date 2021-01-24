package com.itacademy.javacore.homeWork.homeWork6.task1;

//Помещение
// количество жильцов, номер помещения, номер этажа, номер подъезда,
// стоимость аренды квартиры в месяц.

public abstract class Premises implements Rentable {
    protected Tenant tenant;            //арендатор
    protected int numberOfPeople;       //количество людей
    protected int premisesNumber;       //номер помещения
    protected int entranceNumber;       //номер подъезда
    protected int floorNumber;          //номер этажа
    protected int rentPrice;            //стоимость аренды в месяц
    protected boolean inRent = false;   //в аренде
    protected int waterConsumption;     //расход воды в день на 1 человека

    public Premises(Tenant tenant, int premisesNumber, int entranceNumber, int floorNumber, int rentPrice) {
        this.premisesNumber = premisesNumber;
        this.entranceNumber = entranceNumber;
        this.floorNumber = floorNumber;
        this.tenant = tenant;
        this.numberOfPeople = tenant.getNumberOfPeople();
        this.rentPrice = rentPrice;
        rent();
    }

    @Override
    public void rent() {
        this.inRent = true;
    }

    @Override
    public int receiveRentalPayment() {
        return rentPrice;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getPremisesNumber() {
        return premisesNumber;
    }

    public void setPremisesNumber(int premisesNumber) {
        this.premisesNumber = premisesNumber;
    }

    public int getEntranceNumber() {
        return entranceNumber;
    }

    public void setEntranceNumber(int entranceNumber) {
        this.entranceNumber = entranceNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public boolean isInRent() {
        return inRent;
    }

    public void setInRent(boolean inRent) {
        this.inRent = inRent;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }

    public void setWaterConsumption(int waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

}
