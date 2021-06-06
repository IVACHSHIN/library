package com.example.library;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {

    public Book get(Long id) {
        //TODO get book by id from the DB
        Book testBook = new Book();
        testBook.setName("Война и мир");
        testBook.setAuthor("Лев Толстой");
        testBook.setYear(2020);
        return testBook;
    }

    public List<Book> getAll() {
        //TODO get all the books from the DB
        Book testBook = new Book();
        testBook.setName("Война и мир");
        testBook.setAuthor("Лев Толстой");
        testBook.setYear(2020);

        Book testBook2 = new Book();
        testBook2.setName("Война и мир 222");
        testBook2.setAuthor("Лев Толстой 777");
        testBook2.setYear(2021);
        return List.of(testBook, testBook2);
    }

    public Book create(Book book) {
        //TODO save the book to the DB
        return book;
    }

    public Book update(Long id, Book book) {
        //TODO get book by id and update it
        return book;
    }

    public void delete(Long id) {
        //TODO delete book by id
    }
}
