package com.absence.details.controller;

import com.absence.details.entity.AbsenceDetailsEntity;
import com.absence.details.model.AbsenceDetails;
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
    public ResponseEntity<AbsenceDetails> addAbsenceDetails(@RequestBody AbsenceDetailsEntity absenceDetailsEntity) {
        AbsenceDetails absenceDetails = new AbsenceDetails(absenceDetailsService.addAbsenceDetails(absenceDetailsEntity));
        return new ResponseEntity<>(absenceDetails, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<AbsenceDetails> updateAbsenceDetails(@RequestBody AbsenceDetailsEntity absenceDetailsEntity) {
        AbsenceDetails absenceDetails = new AbsenceDetails(absenceDetailsService.updateAbsenceDetails(absenceDetailsEntity));
        return new ResponseEntity<>(absenceDetails, HttpStatus.OK);
    }

    @DeleteMapping("/{absenceDetailsId}")
    public ResponseEntity deleteByAbsenceDetailsId(@PathVariable("absenceDetailsId") Integer absenceDetailsId) {
        absenceDetailsService.deleteByAbsenceDetailsId(absenceDetailsId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity deleteAbsenceDetails(@RequestBody AbsenceDetailsEntity absenceDetailsEntity) {
        absenceDetailsService.deleteAbsenceDetails(absenceDetailsEntity);
        return new ResponseEntity(HttpStatus.OK);
    }
}
