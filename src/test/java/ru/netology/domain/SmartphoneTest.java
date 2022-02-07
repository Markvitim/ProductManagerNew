package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmartphoneTest {

    @Test
    void matchesNameTrue() {
        Smartphone smartphone = new Smartphone(0, "DDD", 1000, "KING");
        Assertions.assertTrue(smartphone.matches("DDD"));
    }
    @Test
    void matchesNameFalse() {
        Smartphone smartphone = new Smartphone(0, "DDD", 1000, "KING");
        Assertions.assertFalse(smartphone.matches("DVD"));
    }

    @Test
    void matchesManufacturerTrue() {
        Smartphone smartphone = new Smartphone(0, "DDD", 1000, "KING");
        Assertions.assertTrue(smartphone.matches("KING"));
    }
    @Test
    void matchesManufacturerFalse() {
        Smartphone smartphone = new Smartphone(0, "DDD", 1000, "KING");
        Assertions.assertFalse(smartphone.matches("KONG"));
    }
}