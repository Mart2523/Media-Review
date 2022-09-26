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

        private String addedBy;
        private org.example.models.DocumentAudit documentAudit;

        private Review[] reviews;

        private String mediaType;

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public DocumentAudit getDocumentAudit() {
        return documentAudit;
    }

    public void setDocumentAudit(DocumentAudit documentAudit) {
        this.documentAudit = documentAudit;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }







    public Book(String isbn, String title, String author, String genres[], String addedBy, DocumentAudit documentAudit, Review[] reviews) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genres = genres;
        this.addedBy = addedBy;
        this.documentAudit = documentAudit;
        this.mediaType = "book";
        this.reviews = reviews;
    }
}
