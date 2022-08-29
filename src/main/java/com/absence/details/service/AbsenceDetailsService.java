package com.absence.details.service;

import com.absence.details.entity.AbsenceDetails;
import com.absence.details.repository.AbsenceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceDetailsService {
    @Autowired
    private AbsenceDetailsRepository absenceDetailsRepository;

    public List<AbsenceDetails> list() {
        return absenceDetailsRepository.findAll();
    }
}
