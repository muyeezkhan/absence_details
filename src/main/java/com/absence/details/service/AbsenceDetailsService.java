package com.absence.details.service;

import com.absence.details.entity.AbsenceDetailsEntity;
import com.absence.details.repository.AbsenceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbsenceDetailsService {
    
    @Autowired
    private AbsenceDetailsRepository absenceDetailsRepository;

    public Optional<AbsenceDetailsEntity> getAbsenceDetails(Integer absenceDetailsId) {
        return absenceDetailsRepository.findById(absenceDetailsId);
    }

    public List<AbsenceDetailsEntity> list() {
        return absenceDetailsRepository.findAll();
    }

    public AbsenceDetailsEntity addAbsenceDetails(AbsenceDetailsEntity absenceDetailsEntity) {
        return absenceDetailsRepository.saveAndFlush(absenceDetailsEntity);
    }

    public AbsenceDetailsEntity updateAbsenceDetails(AbsenceDetailsEntity absenceDetailsEntity) {
        return absenceDetailsRepository.saveAndFlush(absenceDetailsEntity);
    }

    public void deleteAbsenceDetails(AbsenceDetailsEntity absenceDetailsEntity) {
        absenceDetailsRepository.delete(absenceDetailsEntity);
    }

    public void deleteByAbsenceDetailsId(Integer absenceDetailsId) {
        absenceDetailsRepository.deleteById(absenceDetailsId);
    }
}
