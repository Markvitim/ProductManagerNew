package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void matchesNameTrue() {
        Product product = new Smartphone(0, "NNN", 200, "China");
        Assertions.assertTrue(product.matches("NNN"));
    }
    @Test
    void matchesNameFalse() {
        Product product = new Smartphone(0, "NNN", 200, "China");
        Assertions.assertFalse(product.matches("NVN"));
    }
}