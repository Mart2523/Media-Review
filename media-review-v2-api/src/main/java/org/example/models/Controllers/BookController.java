package org.example.controllers;


import org.example.models.Book;
import org.example.models.Data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "Added Book: " + book.getTitle();
    }
    @GetMapping("/getBook/{ISBN}")
    public Optional<Book> getBook(@PathVariable String ISBN){
        System.out.println(ISBN);
        return bookRepository.findBookByISBN(ISBN);
    };
    
}
