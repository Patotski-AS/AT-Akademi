package com.itacademy.javacore.homeWork.homeWork9.task2;

public class Garage<T extends Vehicle> {
    private Vehicle vehicle;
    private double width;
    private double length;


    public Garage() {
    }

    public Garage(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void park (Vehicle vehicle) throws UnsuitableVehicleException, GarageException {
        if (vehicle instanceof Truck)
            throw new TruckException();
        if ((vehicle.getLength()+1)<length && (vehicle.getWidth()+1)<width)
            throw new LargeDimensionsException();
        if (getVehicle()!=null)
            throw  new GarageException();
        if(System.currentTimeMillis()%3 == 0)
            throw new UnsuitableVehicleException();
        this.vehicle = vehicle;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }


    @Override
    public String toString() {
        return "Garage(" + vehicle.getClass().getSimpleName()
                + vehicle +
                ')';
    }
}
