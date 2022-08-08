package org.example.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
    public class Book {

        @Id

        private String ISBN;
        private String Title;
        private String Author;
        private String Genre;


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

        public String getGenre() {
            return Genre;
        }

        public void setGenre(String genre) {
            Genre = genre;
        }

        public Book(String title, String author, String ISBN, String genre) {
            this.Title = title;
            this.Author = author;
            this.ISBN = ISBN;
            this.Genre = genre;
        }
    }
