package com.absence.details.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="ABSENCES_DETAILS")
public class AbsenceDetails {

    @Id
    @GeneratedValue
    @Column(name="ABSENCES_DETAILS_ID")
    private Integer absencesDetailsId;

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

    public Integer getAbsencesDetailsId() {
        return absencesDetailsId;
    }

    public void setAbsencesDetailsId(Integer absencesDetailsId) {
        this.absencesDetailsId = absencesDetailsId;
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
