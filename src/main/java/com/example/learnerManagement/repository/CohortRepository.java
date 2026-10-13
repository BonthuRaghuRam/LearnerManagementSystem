package com.example.learnerManagement.repository;

import com.example.learnerManagement.entity.Cohort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CohortRepository extends JpaRepository<Cohort,Long> {
}
