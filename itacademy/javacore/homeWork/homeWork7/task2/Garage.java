package com.itacademy.javacore.homeWork.homeWork7.task2;

public class Garage<T extends Vehicle> {
    private Vehicle vehicle;

    public Garage() {
    }

    public Garage(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Garage(" + vehicle.getClass().getSimpleName()
                + vehicle +
                ')';
    }
}
