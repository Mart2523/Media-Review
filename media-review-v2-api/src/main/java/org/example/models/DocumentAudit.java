package org.example.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DocumentAudit {

    private String addedBy;

//    private DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//
//    private LocalDateTime dateAdded;

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addBy) {
        this.addedBy = addBy;
    }

//    public LocalDateTime getDateAdded() {
//        return LocalDateTime.parse(dateAdded.format(formatter));
//    }

    public DocumentAudit(){
//        this.dateAdded = java.time.LocalDateTime.now();
    }

    public DocumentAudit(String addedBy) {
        this.addedBy = addedBy;
       // this.dateAdded = java.time.LocalDateTime.now();
    }
}

