package org.example.controllers;



import org.example.models.Book;
import org.example.models.data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping

public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/getBook/{isbn}")
    public Optional<Book> getBook(@PathVariable String isbn) {
        return bookRepository.findBookByIsbn(isbn);

    }


    @PutMapping("/getBook/{isbn}")
    public Book updateBook(@PathVariable String isbn, @RequestBody Book book) {
       Optional<Book> bookData = bookRepository.findBookByIsbn(isbn);
        Book book_ = bookData.get();

        book_.setIsbn(book.getIsbn());
        book_.setTitle(book.getTitle());
        book_.setAuthor(book.getAuthor());
        book_.setGenres(book.getGenres());
        book_.setDocumentAudit(book.getDocumentAudit());
        book_.setMediaType(book.getMediaType());
        book_.setReviews(book.getReviews());


 bookRepository.deleteByIsbn(isbn);
 return bookRepository.save(book);


    }
}