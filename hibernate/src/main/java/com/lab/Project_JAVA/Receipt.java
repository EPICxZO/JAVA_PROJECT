package com.lab.Project_JAVA;

import java.util.Calendar;

import jakarta.persistence.*;

@Entity
@Table
public class Receipt {

    @Id
    @Column(name = "receiptID", length = 5)
    private int receiptID;

    @OneToOne
    @JoinColumn(name = "jobID", nullable = false)
    private RepairJob repairJob1;

    @Column(name = "dateIssued", nullable = false)
    private Calendar dateIssued;

    @Column(name = "totalPrice", length = 10, nullable = false)
    private double totalPrice;

    @Column(name = "paymentMethod", length = 50, nullable = false)
    private String paymentMethod;

    public Receipt() {

    }

    public Receipt(int receiptID, RepairJob repairJob1, Calendar dateIssued, double totalPrice, String paymentMethod) {
        this.receiptID = receiptID;
        this.repairJob1 = repairJob1;
        this.dateIssued = dateIssued;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }

    public int getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(int receiptID) {
        this.receiptID = receiptID;
    }

    public RepairJob getRepairJob1() {
        return repairJob1;
    }

    public void setRepairJob1(RepairJob repairJob1) {
        this.repairJob1 = repairJob1;
    }

    public Calendar getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Calendar dateIssued) {
        this.dateIssued = dateIssued;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
