package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmartphoneTest {

    @Test
    void matchesName() {
        Smartphone smartphone = new Smartphone(0, "DDD", 1000, "KING");
        Assertions.assertEquals(true, smartphone.matches("DDD"));
    }

    @Test
    void matchesManufacturer() {
        Smartphone smartphone = new Smartphone(0, "DDD", 1000, "KING");
        Assertions.assertEquals(false, smartphone.matches("KINGG"));
    }
}