package com.absence.details.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="ABSENCES_DETAILS")
public class AbsenceDetails {

    @Id
    @Column(name="ABSENCES_DETAILS_ID")
    private Integer absencesDetailsId;

    @Column(name="ABSENT_ID")
    private Integer absentId;

    @Column(name="ABSENT_TYPE")
    private String absentType;

    @Column(name="DAYS")
    private Integer days;

    @Column(name="PROJECT_CODE")
    private Integer projectCode;

    @Column(name="FROM_DATE")
    private Date fromDate;

    @Column(name="TO_DATE")
    private Date toDate;

    @Column(name="APPROVAL_STATUS")
    private Boolean approvalStatus;

    public Integer getAbsentId() {
        return absentId;
    }

    public void setAbsentId(Integer absentId) {
        this.absentId = absentId;
    }

    public Integer getAbsencesDetailsId() {
        return absencesDetailsId;
    }

    public void setAbsencesDetailsId(Integer absencesDetailsId) {
        this.absencesDetailsId = absencesDetailsId;
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
