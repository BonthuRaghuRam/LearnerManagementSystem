package com.example.learnerManagement.controller;

import com.example.learnerManagement.entity.Cohort;
import com.example.learnerManagement.service.LearnerManagementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CohortController {

    private final LearnerManagementService service;

    public CohortController(LearnerManagementService service) {
        this.service = service;
    }

    @PostMapping("/cohorts")
    public Cohort createCohort(@RequestBody Cohort cohort) {
        return service.createCohort(cohort);
    }

    @GetMapping("/cohorts")
    public List<Cohort> getAllCohorts() {
        return service.getAllCohorts();
    }
}
