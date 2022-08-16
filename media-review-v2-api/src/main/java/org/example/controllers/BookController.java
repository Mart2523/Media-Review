package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.models.Book;
import org.example.models.Data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public List<Book> getBooks (){
        return bookRepository.findAll();
    }

    @GetMapping("/getBook/{isbn}")
    public Optional<Book> getBook(@PathVariable String isbn){
        System.out.println(isbn);
        return bookRepository.findBookByIsbn(isbn);
    };
}