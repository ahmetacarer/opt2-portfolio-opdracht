package com.company;

import java.util.ArrayList;

public class Data implements VehicleComparison{
    private final ArrayList<Vehicle> vehicles;
    private Vehicle mostExpensiveVehicle;


    public Data(){ vehicles = new ArrayList<Vehicle>();}
    public Data(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public void deleteVehicle(String name) {
        for(int i = 0; i < vehicles.size(); i++){
            if(name.equals(vehicles.get(i).getName())){
                vehicles.remove(i);
                System.out.printf("%s vehicle has been deleted", name);
                return;
            }
        }
        System.out.println("\nNo such vehicle named " + name);
    }

    public Vehicle getMostCostEffectiveVehicle() {
        int kpl = 0;
        Vehicle mostCostEffectiveVehicle = vehicles.get(0);
        for (Vehicle v: vehicles) {
            if(kpl <= v.getKmPerLiter()){
                kpl = v.getKmPerLiter();
                mostCostEffectiveVehicle = v;
            }
            if(v.getFuelType().equals("Electric") || v.getFuelType().equals("electric") ) return v;
        } return mostCostEffectiveVehicle;
    }

    public Vehicle getMostExpensiveVehicle() {
        int highestPrice = vehicles.get(0).getPrice();
        mostExpensiveVehicle = vehicles.get(0);
        for(int i = 1; i < vehicles.size(); i++){
            if(vehicles.get(i).getPrice() > highestPrice){
                highestPrice = vehicles.get(i).getPrice();
                mostExpensiveVehicle = vehicles.get(i);
            }
        }
        return mostExpensiveVehicle;
    }

    public Vehicle getCheapestVehicle() {
        int lowestPrice = vehicles.get(0).getPrice();
        Vehicle cheapestVehicle = vehicles.get(0);
        for (int i = 1; i < vehicles.size(); i++) {
            if(vehicles.get(i).getPrice() < lowestPrice) {
                cheapestVehicle = vehicles.get(i);
                lowestPrice = vehicles.get(i).getPrice();
            }
        }
        return cheapestVehicle;
    }

}
