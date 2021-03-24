package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {
    Data data = new Data();
    @BeforeEach
    void setUp() {
        System.out.println("*****TESTS BEGINNEN*******\n\n");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getVehiclesTest() {
        assertTrue(data.getVehicles().size() == 0);
        data.addVehicle(new Vehicle("Porsche", 12, 123, 2 , 5 , "Benzine"));
        assertTrue(data.getVehicles().size() == 1);
    }

    @Test
    void addVehicleTest() {
    }

    @ParameterizedTest
    @ValueSource(strings = {"audi r8", "Porsche Carrera", "Mercedes Amg","Ferrari 458"})
    void deleteVehicleTest(String name) {
        data.addVehicle(new Vehicle("audi r8", 12, 123, 2 , 5 , "Benzine"));
        data.addVehicle(new Vehicle("Porsche Carrera", 12, 123, 2 , 5 , "Benzine"));
        data.addVehicle(new Vehicle("Mercedes Amg", 12, 123, 2 , 5 , "Benzine"));
        //kijkt of de drie objecten zijn aangemaakt en in de array zitten
        assertEquals(3,data.getVehicles().size());

        data.deleteVehicle(name);
        data.deleteVehicle(name);
        data.deleteVehicle(name);
        assertEquals(2,data.getVehicles().size());

    }

    @RepeatedTest(5)
    void getMostCostEffectiveVehicleTest() {
        String[] names = {"Abarth O21",
                "Acura A21",
                "Alfa Romeo F123",
                "Aston Martin 1S",
                "Audi R8"};
        Vehicle ford = new Vehicle("Ford A5", 12, 123, 2 , 23 , "Benzine");
        data.addVehicle(ford);
        for (int i = 0; i < names.length; i++) {
            data.addVehicle(new Vehicle(names[i], 21+i, 25000*i, 2, 3*i,"Benzine"));
        }
        // check of alle voertuigen zijn toegevoegd
        assertEquals(names.length + 1, data.getVehicles().size());

        assertEquals(ford.getName(), data.getMostCostEffectiveVehicle().getName());
        System.out.println(data.getMostCostEffectiveVehicle().getName());
    }

    @ParameterizedTest
    @ValueSource(ints = {-50, 231, 123333, 123131, 12312, 9999992})
    void getMostExpensiveVehicleTest(int num) {
        Vehicle expectedVehicle = new Vehicle("audi r8", 12, num, 2 , 5 , "Benzine");
        data.addVehicle(expectedVehicle);

        data.addVehicle(new Vehicle("Porsche Carrera", 12, 25421, 2 , 5 , "Benzine"));
        data.addVehicle(new Vehicle("Mercedes Amg", 12, 1231, 2 , 5 , "Diesel"));

        assertEquals(expectedVehicle.getName(), data.getMostExpensiveVehicle().getName());
    }

    @ParameterizedTest
    @ValueSource(ints = {-50, 231, 123333, 123131, 12312, 9999992})
    void getCheapestVehicleTest(int num) {
        Vehicle expectedVehicle = new Vehicle("audi r8", 12, num, 2 , 5 , "Benzine");
        data.addVehicle(expectedVehicle);

        data.addVehicle(new Vehicle("Porsche Carrera", 12, 25421, 2 , 5 , "Benzine"));
        data.addVehicle(new Vehicle("Mercedes Amg", 12, 1231, 2 , 5 , "Diesel"));

        assertEquals(expectedVehicle.getName(), data.getCheapestVehicle().getName());
    }
}