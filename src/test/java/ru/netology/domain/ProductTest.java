package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void matchesName() {
        Product product = new Smartphone(0, "NNN", 200, "China");
        Assertions.assertEquals(true, product.matches("NNN"));
    }
}