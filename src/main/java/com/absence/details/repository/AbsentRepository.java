package com.absence.details.repository;

import com.absence.details.entity.Absents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsentRepository extends JpaRepository<Absents, Integer> {
}
