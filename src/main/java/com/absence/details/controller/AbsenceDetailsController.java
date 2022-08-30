package com.absence.details.controller;

import com.absence.details.entity.AbsenceDetails;
import com.absence.details.service.AbsenceDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/absenceDetails")
public class AbsenceDetailsController {

    @Autowired
    private AbsenceDetailsService absenceDetailsService;

    @PostMapping()
    public ResponseEntity<AbsenceDetails> addAbsenceDetails(@RequestBody AbsenceDetails absenceDetails) {
        return new ResponseEntity<>(absenceDetailsService.addAbsenceDetails(absenceDetails), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<AbsenceDetails> updateAbsenceDetails(@RequestBody AbsenceDetails absenceDetails) {
        return new ResponseEntity<>(absenceDetailsService.updateAbsenceDetails(absenceDetails), HttpStatus.OK);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity deleteByAbsenceDetailsId(@PathVariable("employeeId") Integer employeeId) {
        absenceDetailsService.deleteByAbsenceDetailsId(employeeId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity deleteAbsenceDetails(@RequestBody AbsenceDetails absenceDetails) {
        absenceDetailsService.deleteAbsenceDetails(absenceDetails);
        return new ResponseEntity(HttpStatus.OK);
    }
}
