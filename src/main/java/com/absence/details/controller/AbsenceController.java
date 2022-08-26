package com.absence.details.controller;

import com.absence.details.model.AbsenceDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/absence")
public class AbsenceController {

    @GetMapping("/{employeeId}")
    public AbsenceDetails getEmployeeDetails(@PathVariable("employeeId") Integer employeeId) {
        AbsenceDetails absenceDetails = new AbsenceDetails();
        absenceDetails.setEmployeeId(employeeId);
        absenceDetails.setAnnualLeaveBal(10);
        absenceDetails.setFlexiBalance(2);
        absenceDetails.setSickLeaveBalance(10);
        absenceDetails.setTotalLeaves(22);
        return absenceDetails;
    }
}
