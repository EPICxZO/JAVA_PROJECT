package com.lab.Project_JAVA;

import jakarta.persistence.*;

@Entity
@Table
public class Customer {

    @Id
    @Column(name = "customerID", length = 5)
    private int customerID;

    @Column(name = "customerName", length = 150)
    private String customerName;

    @Column(name = "customerPhone", length = 10)
    private int customerPhone;

    @Column(name = "customerEmail", length = 150)
    private String customerEmail;

    @Column(name = "address")
    private String address;

    @Column(name = "userName", length = 50)
    private String userName;

    @Column(name = "password", length = 50)
    private String password;

    public Customer() {

    }

    public Customer(int customerID, String customerName, int customerPhone, String customerEmail, String address,
            String userName, String password) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.address = address;
        this.userName = userName;
        this.password = password;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
