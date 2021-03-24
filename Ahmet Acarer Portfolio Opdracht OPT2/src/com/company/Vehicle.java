package com.company;

public class Vehicle {
    private String name;
    private int weight;
    private int price;
    private int seatingCapacity;
    private int kmPerLiter;
    private String fuelType;

    public Vehicle(String name, int weight, int price, int seatingCapacity, int kmPerLiter, String fuelType ) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.seatingCapacity = seatingCapacity;
        this.kmPerLiter = kmPerLiter;
        this.fuelType = fuelType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getKmPerLiter() {
        return kmPerLiter;
    }

    public void setKmPerLiter(int kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
