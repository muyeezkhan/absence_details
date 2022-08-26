package com.absence.details.model;

public class AbsenceDetails {
    private Integer totalLeaves;
    private Integer leaveBalance;
    private Integer annualLeaveBal;
    private Integer flexiBalance;
    private Integer sickLeaveBalance;
    private Integer employeeId;

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

    public Integer getLeaveBalance() {
        return this.annualLeaveBal + this.flexiBalance + this.sickLeaveBalance;
    }

    public Integer getAnnualLeaveBal() {
        return annualLeaveBal;
    }

    public void setAnnualLeaveBal(Integer annualLeaveBal) {
        this.annualLeaveBal = annualLeaveBal;
    }

    public Integer getFlexiBalance() {
        return flexiBalance;
    }

    public void setFlexiBalance(Integer flexiBalance) {
        this.flexiBalance = flexiBalance;
    }

    public Integer getSickLeaveBalance() {
        return sickLeaveBalance;
    }

    public void setSickLeaveBalance(Integer sickLeaveBalance) {
        this.sickLeaveBalance = sickLeaveBalance;
    }
}
