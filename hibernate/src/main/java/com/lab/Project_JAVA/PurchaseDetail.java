package com.lab.Project_JAVA;

import org.hibernate.annotations.Check;

import jakarta.persistence.*;

@Entity
@Check(constraints = "qty > 0")
@Check(constraints = "unitCost > 0")
@Table
public class PurchaseDetail {

    @Id
    @Column(name = "purchaseDetailID", length = 4)
    private int purchaseDetailID;

    @ManyToOne
    @JoinColumn(name = "purchaseID", nullable = false)
    private Purchase purchase;

    @ManyToOne
    @JoinColumn(name = "partID", nullable = false)
    private SparePart sparePart;

    @Column(name = "qty", length = 5, nullable = false)
    private int qty;

    @Column(name = "unitCost", length = 10, nullable = false)
    private double unitCost;

    public PurchaseDetail() {

    }

    public PurchaseDetail(int purchaseDetailID, Purchase purchase, SparePart sparePart, int qty, double unitCost) {
        this.purchaseDetailID = purchaseDetailID;
        this.purchase = purchase;
        this.sparePart = sparePart;
        this.qty = qty;
        this.unitCost = unitCost;
    }

    public int getPurchaseDetailID() {
        return purchaseDetailID;
    }

    public void setPurchaseDetailID(int purchaseDetailID) {
        this.purchaseDetailID = purchaseDetailID;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public SparePart getSparePart() {
        return sparePart;
    }

    public void setSparePart(SparePart sparePart) {
        this.sparePart = sparePart;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

}
