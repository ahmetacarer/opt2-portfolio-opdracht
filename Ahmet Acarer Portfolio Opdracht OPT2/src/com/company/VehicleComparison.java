package com.company;

import java.util.ArrayList;

public interface VehicleComparison {
    ArrayList<Vehicle> getVehicles();
    void addVehicle(Vehicle vehicle);
    void deleteVehicle(String name);
    Vehicle getMostCostEffectiveVehicle();
    Vehicle getMostExpensiveVehicle();
    Vehicle getCheapestVehicle();
}
