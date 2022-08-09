package org.example.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("media")
    public class Book {

        private String ISBN;
        private String Title;
        private String Author;
        private String[] Genre;
        private DocumentAudit DocumentAudit;


    public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String author) {
            Author = author;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

    public String[] getGenre() {
        return Genre;
    }

    public void setGenre(String[] genre) {
        Genre = genre;
    }

    public Book(String ISBN, String Title, String Author, String Genre[], DocumentAudit DocumentAudit) {
        this.ISBN = ISBN;
        this.Title = Title;
        this.Author = Author;
        this.Genre = Genre;
        this.DocumentAudit = DocumentAudit;
    }
}
