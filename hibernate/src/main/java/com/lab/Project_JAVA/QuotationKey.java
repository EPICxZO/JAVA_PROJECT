package com.lab.Project_JAVA;

import java.io.Serializable;
import jakarta.persistence.*;

@Embeddable
public class QuotationKey implements Serializable {

    private int jobID;
    private int partID;

    public QuotationKey() {

    }

    public QuotationKey(int jobID, int partID) {
        this.jobID = jobID;
        this.partID = partID;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }
}