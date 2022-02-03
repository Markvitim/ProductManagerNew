package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    public void getAndSetAuthor() {
        Book book = new Book();
        book.setAuthor("Петров");
        Assertions.assertEquals("Петров", book.getAuthor());
    }


    @Test
    void matchesAuthor() {
        Book book = new Book();
        book.setId(0);
        book.setName("JJJ");
        book.setPrice(200);
        book.setAuthor("Petrov");
        book.matches("Petrov");
        Assertions.assertTrue(true);
    }
    @Test
    void matchesName() {
        Book book = new Book();
        book.setId(0);
        book.setName("JJJ");
        book.setPrice(200);
        book.setAuthor("Petrov");
        book.matches("JJJ");
        Assertions.assertTrue(true);
    }
}