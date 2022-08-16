package org.example.models.data;

import java.util.Optional;
import org.example.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
    Optional<Book> findBookByIsbn(String isbn);

}
