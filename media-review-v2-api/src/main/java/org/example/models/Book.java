package org.example.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("media")
    public class Book {

        private String isbn;
        private String title;
        private String author;
        private String[] genres;
        private DocumentAudit documentAudit;

        private String mediaType;


    public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getISBN() {
            return isbn;
        }

        public void setISBN(String ISBN) {
            this.isbn = ISBN;
        }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public Book(String isbn, String title, String author, String genres[], DocumentAudit documentAudit) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genres = genres;
        this.documentAudit = documentAudit;
        this.mediaType = "book";
    }
}
