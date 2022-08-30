package com.absence.details.model;

import com.absence.details.entity.AbsenceDetailsEntity;

import java.util.Date;

public class AbsenceDetails {

    private String absentType;

    private Integer days;

    private Integer projectCode;

    private Date fromDate;

    private Date toDate;

    private Boolean approvalStatus;

    public AbsenceDetails(AbsenceDetailsEntity absenceDetailsEntity) {
        this.absentType = absenceDetailsEntity.getAbsentType();
        this.days = absenceDetailsEntity.getDays();
        this.projectCode = absenceDetailsEntity.getProjectCode();
        this.fromDate = absenceDetailsEntity.getFromDate();
        this.toDate = absenceDetailsEntity.getToDate();
        this.approvalStatus = absenceDetailsEntity.getApprovalStatus();
    }

    public String getAbsentType() {
        return absentType;
    }

    public void setAbsentType(String absentType) {
        this.absentType = absentType;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(Integer projectCode) {
        this.projectCode = projectCode;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Boolean getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
}
