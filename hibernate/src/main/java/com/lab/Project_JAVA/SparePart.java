package com.lab.Project_JAVA;

import org.hibernate.annotations.Check;

import jakarta.persistence.*;

@Entity
@Check(constraints = "price > 0")
@Check(constraints = "QtySpare >= 0")
@Table
public class SparePart {

    @Id
    @Column(name = "partID", length = 5)
    private int partID;

    @Column(name = "partName", length = 150, nullable = false)
    private String partName;

    @Column(name = "price", length = 10, nullable = false)
    private double price;

    @Column(name = "QtySpare", length = 5, nullable = false)
    private int QtySpare;

    public SparePart() {

    }

    public SparePart(int partID, String partName, double price, int qtySpare) {
        this.partID = partID;
        this.partName = partName;
        this.price = price;
        this.QtySpare = qtySpare;
    }

    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtySpare() {
        return QtySpare;
    }

    public void setQtySpare(int qtySpare) {
        QtySpare = qtySpare;
    }

}
