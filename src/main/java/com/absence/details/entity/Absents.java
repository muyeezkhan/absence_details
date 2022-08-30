package com.absence.details.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name="ABSENTS")
public class Absents {

    @Id
    @Column(name="ABSENT_ID")
    private Integer absentId;

    @Column(name="EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name="TOTAL_LEAVES")
    private Integer totalLeaves;

    @Column(name="FLEXI_LEAVES")
    private Integer flexiLeaves;

    @Column(name="SICK_LEAVES")
    private Integer sickLeaves;

    @Column(name="ANNUAL_LEAVES")
    private Integer annualLeaves;

    @OneToMany(mappedBy = "absentId")
    private List<AbsenceDetails> absenceDetails;

    public List<AbsenceDetails> getAbsenceDetails() {
        return absenceDetails;
    }

    public void setAbsenceDetails(List<AbsenceDetails> absenceDetails) {
        this.absenceDetails = absenceDetails;
    }

    public Integer getAbsentId() {
        return absentId;
    }

    public void setAbsentId(Integer absentId) {
        this.absentId = absentId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getTotalLeaves() {
        return totalLeaves;
    }

    public void setTotalLeaves(Integer totalLeaves) {
        this.totalLeaves = totalLeaves;
    }

    public Integer getFlexiLeaves() {
        return flexiLeaves;
    }

    public void setFlexiLeaves(Integer flexiLeaves) {
        this.flexiLeaves = flexiLeaves;
    }

    public Integer getSickLeaves() {
        return sickLeaves;
    }

    public void setSickLeaves(Integer sickLeaves) {
        this.sickLeaves = sickLeaves;
    }

    public Integer getAnnualLeaves() {
        return annualLeaves;
    }

    public void setAnnualLeaves(Integer annualLeaves) {
        this.annualLeaves = annualLeaves;
    }
}
