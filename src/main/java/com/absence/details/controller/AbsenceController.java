package com.absence.details.controller;

import com.absence.details.entity.AbsenceDetails;
import com.absence.details.service.AbsenceDetailsService;
import com.absence.details.util.JWTAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/absence")
public class AbsenceController {

    @Autowired
    private JWTAuthentication jwtAuthentication;

    @Autowired
    private AbsenceDetailsService absenceDetailsService;

    @GetMapping("/{employeeId}")
    public AbsenceDetails getEmployeeDetails(@PathVariable("employeeId") Integer employeeId) {
        AbsenceDetails absenceDetails = new AbsenceDetails();
        return absenceDetails;
    }

    @GetMapping("/list")
    public ResponseEntity<List<AbsenceDetails>> getAllEmployees() {
        return new ResponseEntity<List<AbsenceDetails>>(absenceDetailsService.list(), HttpStatus.OK);
    }

    @GetMapping("/token")
    public ResponseEntity<String> getToken() {
        return new ResponseEntity<>(jwtAuthentication.getToken(), HttpStatus.OK);
    }
}
