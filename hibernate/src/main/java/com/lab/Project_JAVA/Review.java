package com.lab.Project_JAVA;

import jakarta.persistence.*;

@Entity
@Table
public class Review {

    @Id
    @Column(name = "ReviewID", length = 5)
    private int ReviewID;

    @ManyToOne
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "jobID", nullable = false)
    private RepairJob repairJob;

    @Column(name = "rating", length = 1)
    private int rating;

    @Column(name = "reviewComment", length = 1000)
    private String reviewComment;

    public Review() {

    }

    public Review(int reviewID, Customer customer, RepairJob repairJob, int rating, String reviewComment) {
        ReviewID = reviewID;
        this.customer = customer;
        this.repairJob = repairJob;
        this.rating = rating;
        this.reviewComment = reviewComment;
    }

    public int getReviewID() {
        return ReviewID;
    }

    public void setReviewID(int reviewID) {
        ReviewID = reviewID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RepairJob getRepairJob() {
        return repairJob;
    }

    public void setRepairJob(RepairJob repairJob) {
        this.repairJob = repairJob;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }
}
