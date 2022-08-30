package com.absence.details.repository;

import com.absence.details.entity.AbsenceDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsenceDetailsRepository extends JpaRepository<AbsenceDetailsEntity, Integer> {
}
