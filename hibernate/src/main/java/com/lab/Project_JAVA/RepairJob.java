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
