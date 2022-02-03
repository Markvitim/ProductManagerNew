package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book coreJava = new Book();
    private Book first = new Book(1, "Учебник", 300, "Иванов");
    private Book second = new Book(2, "История", 250, "Гришин");
    private Book third = new Book(3, "Журнал", 180, "Издательство");
    private Smartphone fff = new Smartphone(4, "FFF", 1000, "China");
    private Smartphone sss = new Smartphone(5, "SSS", 1200, "Vietnam");
    private Smartphone ttt = new Smartphone(6, "ttt", 1500, "India");


    @BeforeEach
    void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fff);
        repository.save(sss);
        repository.save(ttt);
    }

    @Test
    void shouldSaveOne() {
        repository.save(coreJava);
        Product[] expected = new Product[]{first, second, third, fff, sss, ttt, coreJava};
        Product[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        Product[] expected = new Product[]{first, second, third, fff, sss, ttt};
        Assertions.assertArrayEquals(expected, repository.findAll());
    }

    @Test
    void shouldRemoveById() {
        repository.removeById(4);
        Product[] expected = new Product[]{first, second, third, sss, ttt};
        Assertions.assertArrayEquals(expected, repository.findAll());
    }

    @Test
    void shouldFindById() {
        Product actual = repository.findById(4);
        Product expected = new Smartphone(4, "FFF", 1000, "China");
        Assertions.assertEquals(expected, actual);
    }
}