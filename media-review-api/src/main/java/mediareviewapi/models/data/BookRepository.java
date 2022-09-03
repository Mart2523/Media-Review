package main.java.mediareviewapi.models.data;

import main.java.mediareviewapi.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

}
