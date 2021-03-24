package com.company;

public class Car extends Vehicle{
    int amountOfDoors;
    int luggageCapacity;
    private final Engine engine;
    public Car(String name, int weight, int price, int seatingCapacity, int kmPerLiter, String fuelType, int amountOfDoors,int luggageCapacity,String engineName) {
        super(name, weight, price, seatingCapacity, kmPerLiter, fuelType);
        this.amountOfDoors = amountOfDoors;
        this.luggageCapacity = luggageCapacity;
        engine = new Engine();
    }

    public int getAmountOfDoors() { return amountOfDoors; }

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }
}
