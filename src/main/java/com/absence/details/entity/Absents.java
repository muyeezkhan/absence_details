package com.absence.details.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="ABSENTS")
public class Absents {

    @Id
    @GeneratedValue
    @Column(name="ABSENT_ID")
    private Integer absentId;

    @Column(name="EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name="ABSENCES_DETAILS_ID")
    private Integer absencesDetailsId;

    @Column(name="ABSENT_TYPE")
    private String absentType;

    @Column(name="DAYS")
    private Integer days;

    @Column(name="PROJECTCODE")
    private Integer projectCode;

    @Column(name="FROM_DATE")
    private Date fromdate;

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

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
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
