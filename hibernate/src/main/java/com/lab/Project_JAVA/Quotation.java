package com.lab.Project_JAVA;

import java.util.Calendar;
import jakarta.persistence.*;

@Entity
@Table
public class Quotation {

    @EmbeddedId
    private QuotationKey id;

    @ManyToOne
    @MapsId("jobID")
    @JoinColumn(name = "JobID")
    private RepairJob repairJob;

    @ManyToOne
    @MapsId("partID")
    @JoinColumn(name = "PartID")
    private SparePart sparePart;

    @Column(name = "workDescription", nullable = false)
    private String workDescription;

    @Column(name = "workDate", nullable = false)
    private Calendar workDate;

    @Column(name = "amount", nullable = false)
    private int amount;

    @Column(name = "dateWithdraw", nullable = false)
    private Calendar dateWithdraw;

    public Quotation() {

    }

    public Quotation(QuotationKey id, RepairJob repairJob, SparePart sparePart, String workDescription,
            Calendar workDate, int amount, Calendar dateWithdraw) {
        this.id = id;
        this.repairJob = repairJob;
        this.sparePart = sparePart;
        this.workDescription = workDescription;
        this.workDate = workDate;
        this.amount = amount;
        this.dateWithdraw = dateWithdraw;
    }

    public Quotation(RepairJob repairJob, SparePart sparePart, String workDescription,
            Calendar workDate, int amount, Calendar dateWithdraw) {
        this.repairJob = repairJob;
        this.sparePart = sparePart;
        this.id = new QuotationKey(repairJob.getJobID(), sparePart.getPartID());
        this.workDescription = workDescription;
        this.workDate = workDate;
        this.amount = amount;
        this.dateWithdraw = dateWithdraw;
    }

    public QuotationKey getId() {
        return id;
    }

    public void setId(QuotationKey id) {
        this.id = id;
    }

    public RepairJob getRepairJob() {
        return repairJob;
    }

    public void setRepairJob(RepairJob repairJob) {
        this.repairJob = repairJob;
    }

    public SparePart getSparePart() {
        return sparePart;
    }

    public void setSparePart(SparePart sparePart) {
        this.sparePart = sparePart;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    public Calendar getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Calendar workDate) {
        this.workDate = workDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Calendar getDateWithdraw() {
        return dateWithdraw;
    }

    public void setDateWithdraw(Calendar dateWithdraw) {
        this.dateWithdraw = dateWithdraw;
    }

}