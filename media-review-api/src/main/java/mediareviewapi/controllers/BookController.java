package mediareviewapi.controllers;

import mediareviewapi.models.Book;
import mediareviewapi.models.data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/add-book")
    public String addBook(@RequestBody Book book) {
        bookRepository.save(book);
                return "Added Book: " + book.getTitle();
    }

}


