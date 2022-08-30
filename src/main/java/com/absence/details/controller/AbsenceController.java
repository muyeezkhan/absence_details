package com.absence.details.controller;

import com.absence.details.entity.Absents;
import com.absence.details.service.AbsentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/absents")
public class AbsenceController {

    @Autowired
    private AbsentsService absentsService;

    @GetMapping("/{absenceId}")
    public ResponseEntity<Absents> getAbsents(@PathVariable("absenceId") Integer absenceId) {
        return new ResponseEntity<>(absentsService.getAbsents(absenceId).get(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Absents>> getAllAbsents() {
        return new ResponseEntity<>(absentsService.list(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Absents> addAbsents(@RequestBody Absents absents) {
        return new ResponseEntity<>(absentsService.addAbsents(absents), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Absents> updateAbsents(@RequestBody Absents absents) {
        return new ResponseEntity<>(absentsService.updateAbsents(absents), HttpStatus.OK);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity deleteByAbsenceId(@PathVariable("employeeId") Integer employeeId) {
        absentsService.deleteByAbsenceId(employeeId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity deleteAbsents(@RequestBody Absents absents) {
        absentsService.deleteAbsents(absents);
        return new ResponseEntity(HttpStatus.OK);
    }
}
