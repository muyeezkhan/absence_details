package com.absence.details.repository;

import com.absence.details.entity.AbsentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsentRepository extends JpaRepository<AbsentsEntity, Integer> {
}
