package org.example.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class DocumentAudit {

    private String addedBy;
    private Date date = new Date();

//    private DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//
//    private LocalDateTime dateAdded;
    private String dateAdded = String.valueOf(date);

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addBy) {
        this.addedBy = addBy;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    //    public LocalDateTime getDateAdded() {
//        return LocalDateTime.parse(dateAdded.format(formatter));
//    }

    public DocumentAudit(){
//        this.dateAdded = java.time.LocalDateTime.now();
    }


    public DocumentAudit(String addedBy, String dateAdded) {
        this.addedBy = addedBy;
        this.dateAdded = dateAdded;
    }
}

