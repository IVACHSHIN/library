package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    @Autowired
    public BookRepository bookRepository;

    public Book get(Long id) {
        Optional<Book> optional = bookRepository.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        }

        throw new RuntimeException("Book not found");

    }

    public List<Book> getAll() {
        Iterator<Book> iterator = bookRepository.findAll().iterator();

        List<Book> books = new ArrayList<>();

        while (iterator.hasNext()) {
            books.add(iterator.next());
        }
        return books;

    }

    public Book create(Book book) {
        Book saved = bookRepository.save(book);
        return saved;
    }

    public Book update(Long id, Book book) {
        Book original = get(id);
        original.setName(book.getName());
        original.setAuthor(book.getAuthor());
        original.setDescription(book.getDescription());
        original.setPublisher(book.getPublisher());
        original.setIsbn(book.getIsbn());
        original.setYear(book.getYear());

        Book updated = bookRepository.save(original);
        return updated;
    }

    public void delete(Long id) {
        Book book = get(id);
        bookRepository.delete(book);
    }
}
