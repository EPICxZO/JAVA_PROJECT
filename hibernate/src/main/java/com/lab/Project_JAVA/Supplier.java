package com.lab.Project_JAVA;

import jakarta.persistence.*;

@Entity
@Table
public class Supplier {

    @Id
    @Column(name = "supplierID", length = 4)
    private int supplierID;

    @Column(name = "supplierName", length = 100, nullable = false)
    private String supplierName;

    @Column(name = "supplier_Phone", length = 10, nullable = false)
    private int supplier_Phone;

    @Column(name = "supplier_Email", length = 100, nullable = false)
    private String supplier_Email;

    @Column(name = "supplier_Address", nullable = false)
    private String supplier_Address;

    public Supplier(int supplierID, String supplierName, int supplier_Phone, String supplier_Email,
            String supplier_Address) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.supplier_Phone = supplier_Phone;
        this.supplier_Email = supplier_Email;
        this.supplier_Address = supplier_Address;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getSupplier_Phone() {
        return supplier_Phone;
    }

    public void setSupplier_Phone(int supplier_Phone) {
        this.supplier_Phone = supplier_Phone;
    }

    public String getSupplier_Email() {
        return supplier_Email;
    }

    public void setSupplier_Email(String supplier_Email) {
        this.supplier_Email = supplier_Email;
    }

    public String getSupplier_Address() {
        return supplier_Address;
    }

    public void setSupplier_Address(String supplier_Address) {
        this.supplier_Address = supplier_Address;
    }
}
