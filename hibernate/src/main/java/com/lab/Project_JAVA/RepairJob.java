package com.lab.Project_JAVA;

import java.util.Calendar;

import org.hibernate.annotations.Check;

import jakarta.persistence.*;

@Entity
@Check(constraints = "status IN ('รอซ่อม','กำลังซ่อม','รออะไหล่','เสร็จสิ้น','ยกเลิกงาน')")
@Table
public class RepairJob {

    @Id
    @Column(name = "jobID", length = 5)
    private int jobID;

    @ManyToOne
    @JoinColumn(name = "customerID", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "TechnicianID", nullable = false)
    private Technician technician;

    @Column(name = "modelName", length = 150, nullable = false)
    private String modelName;

    @Column(name = "typeName", length = 100, nullable = false)
    private String typeName;

    @Column(name = "brand", length = 100, nullable = false)
    private String brand;

    @Column(name = "dateReceived", nullable = false)
    private Calendar dateReceived;

    @Column(name = "appoinmentDate", nullable = false)
    private Calendar appoinmentDate;

    @Column(name = "status", nullable = false)
    private String status;

    public RepairJob() {

    }

    public RepairJob(int jobID, String modelName, String typeName, String brand, Calendar dateReceived,
            Calendar appoinmentDate, String status) {
        this.jobID = jobID;
        this.modelName = modelName;
        this.typeName = typeName;
        this.brand = brand;
        this.dateReceived = dateReceived;
        this.appoinmentDate = appoinmentDate;
        this.status = status;
    }

    public RepairJob(int jobID, Customer customer, Technician technician, String modelName, String typeName,
            String brand, Calendar dateReceived, Calendar appoinmentDate, String status) {
        this.jobID = jobID;
        this.customer = customer;
        this.technician = technician;
        this.modelName = modelName;
        this.typeName = typeName;
        this.brand = brand;
        this.dateReceived = dateReceived;
        this.appoinmentDate = appoinmentDate;
        this.status = status;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Calendar getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Calendar dateReceived) {
        this.dateReceived = dateReceived;
    }

    public Calendar getAppoinmentDate() {
        return appoinmentDate;
    }

    public void setAppoinmentDate(Calendar appoinmentDate) {
        this.appoinmentDate = appoinmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
