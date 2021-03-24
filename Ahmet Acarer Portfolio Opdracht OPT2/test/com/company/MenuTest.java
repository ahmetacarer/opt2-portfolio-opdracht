package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
class MenuTest {
/*
Test zowel positieve als negatieve scenarios.
Test met verschillende inputs
Test met negatieve getallen
Test met grenswaarden
Test met null waardes
Test met “onverwachte” input
*/
    Menu menu = new Menu();
    @BeforeEach
    void setUp() {
        System.out.println("*****TESTS BEGINNEN*******\n\n");

    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,4,6,-2,41})
    void mainMenuListTest(){
        
    }

    @Test
    void mainTest() {
    }

    @Test
    void addVehicleFromMain(){
    }

    @Test
    void deleteVehicleFromMain(){

    }


}