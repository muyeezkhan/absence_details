package com.absence.details.service;

import com.absence.details.entity.AbsentsEntity;
import com.absence.details.repository.AbsentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbsentsService {

    @Autowired
    private AbsentRepository absentRepository;

    public Optional<AbsentsEntity> getAbsents(Integer absenceId) {
        return absentRepository.findById(absenceId);
    }

    public List<AbsentsEntity> list() {
        return absentRepository.findAll();
    }

    public AbsentsEntity addAbsents(AbsentsEntity absentsEntity) {
        return absentRepository.saveAndFlush(absentsEntity);
    }

    public AbsentsEntity updateAbsents(AbsentsEntity absentsEntity) {
        return absentRepository.saveAndFlush(absentsEntity);
    }

    public void deleteAbsents(AbsentsEntity AbsentsEntity) {
        absentRepository.delete(AbsentsEntity);
    }

    public void deleteByAbsenceId(Integer absenceId) {
        absentRepository.deleteById(absenceId);
    }
}
