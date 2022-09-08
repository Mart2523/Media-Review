package org.example.models;

public class Review {


    private String review;
    private String reviewedBy;
    private String reviewID;

    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }


    public void setReview(String review) {
        this.review = review;
    }
    public String getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(String reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }





    public Review(String review, String reviewedBy, String reviewID, int rating) {
        this.review = review;
        this.reviewedBy = reviewedBy;
        this.reviewID = reviewID;
        this.rating = rating;
    }
}
