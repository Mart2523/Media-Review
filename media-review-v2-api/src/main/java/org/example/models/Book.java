package org.example.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("media")
    public class Book {

        private String iSBN;
        private String title;
        private String author;
        private String[] genre;
        private DocumentAudit documentAudit;


    public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            author = author;
        }

        public String getISBN() {
            return iSBN;
        }

        public void setISBN(String ISBN) {
            this.iSBN = ISBN;
        }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        genre = genre;
    }

    public Book(String iSBN, String title, String author, String genre[], DocumentAudit documentAudit) {
        this.iSBN = iSBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.documentAudit = documentAudit;
    }
}
