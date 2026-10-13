package com.example.learnerManagement.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cohorts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cohortName;

    @ManyToMany
    @JoinTable(
        name = "cohort_learner",
        joinColumns = @JoinColumn(name = "cohort_id"),
        inverseJoinColumns = @JoinColumn(name = "learner_id")
    )
    private List<Learner> learners = new ArrayList<>();
}
