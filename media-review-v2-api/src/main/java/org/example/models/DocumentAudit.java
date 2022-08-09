package org.example.models;

import java.time.LocalDate;


public class DocumentAudit {

    private String addedBy;
    private LocalDate dateAdded;

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addBy) {
        this.addedBy = addBy;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }


    public DocumentAudit(String addedBy, LocalDate dateAdded) {
        this.addedBy = addedBy;
        this.dateAdded = java.time.LocalDate.now();
    }
}

