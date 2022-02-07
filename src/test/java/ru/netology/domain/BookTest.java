package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookTest {
    @Test
    public void getAndSetAuthor() {
        Book book = new Book();
        book.setAuthor("Петров");
        Assertions.assertEquals("Петров", book.getAuthor());
    }


    @Test
    void matchesAuthorTrue() {
        Book book = new Book(0, "JJJ", 200, "Petrov");
        Assertions.assertTrue(book.matches("Petrov"));
    }
    @Test
    void matchesAuthorFalse() {
        Book book = new Book(0, "JJJ", 200, "Petrov");
        Assertions.assertFalse(book.matches("Petrovv"));
    }

    @Test
    void matchesNameTrue() {
        Book book = new Book(0, "JJJ", 200, "Petrov");
        Assertions.assertTrue(book.matches("JJJ"));
    }
    @Test
    void matchesNameFalse() {
        Book book = new Book(0, "JJJ", 200, "Petrov");
        Assertions.assertFalse(book.matches("JVJ"));
    }


}