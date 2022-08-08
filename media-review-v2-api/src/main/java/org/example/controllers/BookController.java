package org.example.controllers;

import org.example.models.Book;
import org.example.models.Data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/add-book")
    public String addBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "Added Book: " + book.getTitle();
    }
}
