package com.example.learnerManagement.service;

import com.example.learnerManagement.entity.Cohort;
import com.example.learnerManagement.repository.CohortRepository;
import com.example.learnerManagement.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearnerManagementService {

    private final LearnerRepository learnerRepository;
    private final CohortRepository cohortRepository;

    public LearnerManagementService(LearnerRepository learnerRepository,
                                    CohortRepository cohortRepository) {
        this.learnerRepository = learnerRepository;
        this.cohortRepository = cohortRepository;
    }

    public Cohort createCohort(Cohort cohort) {
        return cohortRepository.save(cohort);
    }

    public List<Cohort> getAllCohorts() {
        return cohortRepository.findAll();
    }
}