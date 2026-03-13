package com.lab.Project_JAVA;

import java.util.Calendar;

import org.hibernate.annotations.Check;

import jakarta.persistence.*;

@Entity
@Check(constraints = "totalAmount > 0")
@Table
public class Purchase {

    @Id
    @Column(name = "purchaseID", length = 4)
    private int purchaseID;

    @ManyToOne
    @JoinColumn(name = "supplierID", nullable = false)
    private Supplier supplier;

    @Column(name = "purchaseDate", nullable = false)
    private Calendar purchaseDate;

    @Column(name = "totalAmount")
    private double totalAmount;

    public Purchase() {

    }

    public Purchase(int purchaseID, Supplier supplier, Calendar purchaseDate, double totalAmount) {
        this.purchaseID = purchaseID;
        this.supplier = supplier;
        this.purchaseDate = purchaseDate;
        this.totalAmount = totalAmount;
    }

    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Calendar getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Calendar purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
