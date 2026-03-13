package com.lab.Project_JAVA;

import jakarta.persistence.*;

@Entity
@Table
public class Technician {

    @Id
    @Column(name = "TechnicianID", length = 5)
    private int TechnicianID;

    @Column(name = "TechName", length = 100, nullable = false)
    private String TechName;

    @Column(name = "Tech_Phone", length = 10, nullable = false)
    private int Tech_Phone;

    @Column(name = "Tech_Email", length = 100, nullable = false)
    private String Tech_Email;

    @Column(name = "Tech_Position", length = 150, nullable = false)
    private String Tech_Position;

    public Technician() {

    }

    public Technician(int technicianID, String techName, int tech_Phone, String tech_Email, String tech_Position) {
        TechnicianID = technicianID;
        TechName = techName;
        Tech_Phone = tech_Phone;
        Tech_Email = tech_Email;
        Tech_Position = tech_Position;
    }

    public int getTechnicianID() {
        return TechnicianID;
    }

    public void setTechnicianID(int technicianID) {
        TechnicianID = technicianID;
    }

    public String getTechName() {
        return TechName;
    }

    public void setTechName(String techName) {
        TechName = techName;
    }

    public int getTech_Phone() {
        return Tech_Phone;
    }

    public void setTech_Phone(int tech_Phone) {
        Tech_Phone = tech_Phone;
    }

    public String getTech_Email() {
        return Tech_Email;
    }

    public void setTech_Email(String tech_Email) {
        Tech_Email = tech_Email;
    }

    public String getTech_Position() {
        return Tech_Position;
    }

    public void setTech_Position(String tech_Position) {
        Tech_Position = tech_Position;
    }

}
