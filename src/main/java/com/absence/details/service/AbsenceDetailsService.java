package com.absence.details.service;

import com.absence.details.entity.AbsenceDetails;
import com.absence.details.repository.AbsenceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbsenceDetailsService {
    
    @Autowired
    private AbsenceDetailsRepository absenceDetailsRepository;

    public Optional<AbsenceDetails> getAbsenceDetails(Integer absenceDetailsId) {
        return absenceDetailsRepository.findById(absenceDetailsId);
    }

    public List<AbsenceDetails> list() {
        return absenceDetailsRepository.findAll();
    }

    public AbsenceDetails addAbsenceDetails(AbsenceDetails absenceDetails) {
        return absenceDetailsRepository.saveAndFlush(absenceDetails);
    }

    public AbsenceDetails updateAbsenceDetails(AbsenceDetails absenceDetails) {
        return absenceDetailsRepository.saveAndFlush(absenceDetails);
    }

    public void deleteAbsenceDetails(AbsenceDetails absenceDetails) {
        absenceDetailsRepository.delete(absenceDetails);
    }

    public void deleteByAbsenceDetailsId(Integer absenceDetailsId) {
        absenceDetailsRepository.deleteById(absenceDetailsId);
    }
}
