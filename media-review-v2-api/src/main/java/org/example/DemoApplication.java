package org.example;

import org.example.models.Book;
import org.example.models.Data.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(BookRepository repository) {
        return args -> {
            Book book = new Book(
                    "1000100020",
                    "123456",
                    "FirstTest",
                    "Test Author",
                    "Horror"

            );
            repository.insert(book);
        };
    }
}