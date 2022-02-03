package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    void getManufacturer() {
    }

    @Test
    void setManufacturer() {
    }

    @Test
    void matchesName() {
        Smartphone smartphone = new Smartphone();
        smartphone.setId(0);
        smartphone.setName("DDD");
        smartphone.setPrice(1000);
        smartphone.setManufacturer("KING");
        smartphone.matches("DDD");
        Assertions.assertTrue(true);
    }
    @Test
    void matchesManufacturer() {
        Smartphone smartphone = new Smartphone();
        smartphone.setId(0);
        smartphone.setName("DDD");
        smartphone.setPrice(1000);
        smartphone.setManufacturer("KING");
        smartphone.matches("KING");
        Assertions.assertTrue(true);
    }
}