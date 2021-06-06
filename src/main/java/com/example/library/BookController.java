package com.example.library;

import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @GetMapping("/book")
    public String getAllBooks() {
        return "All the books";
    }
    @GetMapping("/book/{id}")
    public String getBookById(@PathVariable Long id) {
        return "book by id " + id;
    }
    @PostMapping("/book")
    public String createBook() {
        return "Create a book";
    }
    @PutMapping("/book/{id}")
    public String editBook(@PathVariable Long id) {
        return "Edit book by id " + id;
    }
    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable Long id) {
        return "Delete a bool by id " + id;
    }
}
