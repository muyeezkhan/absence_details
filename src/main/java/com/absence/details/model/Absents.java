package com.absence.details.model;

import com.absence.details.entity.AbsentsEntity;

import java.util.ArrayList;
import java.util.List;

public class Absents {

    private Integer absentId;

    private Integer employeeId;

    private Integer totalLeaves;

    private Integer flexiLeaves;

    private Integer sickLeaves;

    private Integer annualLeaves;

    private List<AbsenceDetails> absenceDetails;

    public Absents(AbsentsEntity absentsEntity) {
        this.absentId = absentsEntity.getAbsentId();
        this.employeeId = absentsEntity.getEmployeeId();
        this.totalLeaves = absentsEntity.getTotalLeaves();
        this.flexiLeaves = absentsEntity.getFlexiLeaves();
        this.sickLeaves = absentsEntity.getSickLeaves();
        this.annualLeaves = absentsEntity.getAnnualLeaves();
        this.absenceDetails = new ArrayList<>();
        absentsEntity.getAbsenceDetails().forEach(s -> this.absenceDetails.add(new AbsenceDetails(s)));
    }

    public Integer getAbsentId() {
        return absentId;
    }

    public void setAbsentId(Integer absentId) {
        this.absentId = absentId;
    }

    public List<AbsenceDetails> getAbsenceDetails() {
        return absenceDetails;
    }

    public void setAbsenceDetails(List<AbsenceDetails> absenceDetails) {
        this.absenceDetails = absenceDetails;
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
