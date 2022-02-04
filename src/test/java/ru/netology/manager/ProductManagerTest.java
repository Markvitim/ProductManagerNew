package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

class ProductManagerTest {
    private ProductManager manager = new ProductManager();
    private Book coreJava = new Book();
    private Book first = new Book(1, "Учебник", 300, "India");
    private Book second = new Book(2, "FFF", 250, "India");
    private Book third = new Book(3, "Журнал", 180, "Издательство");
    private Smartphone fff = new Smartphone(4, "FFF", 1000, "China");
    private Smartphone sss = new Smartphone(5, "SSS", 1200, "Vietnam");
    private Smartphone ttt = new Smartphone(6, "ttt", 1500, "India");


    @BeforeEach
    void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fff);
        manager.add(sss);
        manager.add(ttt);
    }

    @Test
    void add() {
        manager.add(coreJava);
        Product[] expected = new Product[]{first, second, third, fff, sss, ttt, coreJava};
        Product[] actual = manager.getAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByIndia() {
        Product[] expected = new Product[]{first, second, ttt};
        Product[] actual = manager.searchBy("India");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByFFF() {
        Product[] expected = new Product[]{second, fff};
        Product[] actual = manager.searchBy("FFF");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBy() {
        Product[] expected = new Product[]{};
        Product[] actual = manager.searchBy("ghvbvhf");
        Assertions.assertArrayEquals(expected, actual);
    }

}