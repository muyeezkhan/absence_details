package com.absence.details.service;

import com.absence.details.entity.Absents;
import com.absence.details.repository.AbsentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbsentsService {

    @Autowired
    private AbsentRepository absentRepository;

    public Optional<Absents> getAbsents(Integer absenceId) {
        return absentRepository.findById(absenceId);
    }

    public List<Absents> list() {
        return absentRepository.findAll();
    }

    public Absents addAbsents(Absents absents) {
        return absentRepository.saveAndFlush(absents);
    }

    public Absents updateAbsents(Absents absents) {
        return absentRepository.saveAndFlush(absents);
    }

    public void deleteAbsents(Absents Absents) {
        absentRepository.delete(Absents);
    }

    public void deleteByAbsenceId(Integer absenceId) {
        absentRepository.deleteById(absenceId);
    }
}
