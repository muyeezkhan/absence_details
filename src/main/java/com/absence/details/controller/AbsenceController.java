package com.absence.details.controller;

import com.absence.details.entity.AbsentsEntity;
import com.absence.details.model.Absents;
import com.absence.details.service.AbsentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/absents")
public class AbsenceController {

    @Autowired
    private AbsentsService absentsService;

    @GetMapping("/{absenceId}")
    public ResponseEntity<Absents> getAbsents(@PathVariable("absenceId") Integer absenceId) {
        Absents absents = new Absents(absentsService.getAbsents(absenceId).get());
        return new ResponseEntity<>(absents, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Absents>> getAllAbsents() {
        List<Absents> absentsList = new ArrayList<>();
        absentsService.list().forEach(s -> absentsList.add(new Absents(s)));
        return new ResponseEntity<>(absentsList, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Absents> addAbsents(@RequestBody AbsentsEntity absentsEntity) {
        Absents absents = new Absents(absentsService.addAbsents(absentsEntity));
        return new ResponseEntity<>(absents, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Absents> updateAbsents(@RequestBody AbsentsEntity absentsEntity) {
        Absents absents = new Absents(absentsService.updateAbsents(absentsEntity));
        return new ResponseEntity<>(absents, HttpStatus.OK);
    }

    @DeleteMapping("/{absenceId}")
    public ResponseEntity deleteByAbsenceId(@PathVariable("absenceId") Integer absenceId) {
        absentsService.deleteByAbsenceId(absenceId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity deleteAbsents(@RequestBody AbsentsEntity absentsEntity) {
        absentsService.deleteAbsents(absentsEntity);
        return new ResponseEntity(HttpStatus.OK);
    }
}
