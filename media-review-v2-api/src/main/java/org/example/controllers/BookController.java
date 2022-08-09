package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.models.Book;
import org.example.models.Data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks (@RequestBody Book book){
        return bookRepository.findAll();
    }
}