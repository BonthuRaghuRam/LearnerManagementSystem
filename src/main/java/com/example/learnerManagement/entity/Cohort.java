package com.example.learnerManagement.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cohort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cohortid;

    private String cohortName;
    private String cohortDescription;

    @ManyToMany
    @JoinTable(
        name = "cohort_learner",
        joinColumns = @JoinColumn(name = "cohort_id"),
        inverseJoinColumns = @JoinColumn(name = "learner_id")
    )
    private List<Learner> learners = new ArrayList<>();

    public Cohort() {
    }

    public Long getId() {
        return cohortid;
    }

    public void setId(Long id) {
        this.cohortid = id;
    }

    public String getCohortName() {
        return cohortName;
    }

    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public List<Learner> getLearners() {
        return learners;
    }

    public void setLearners(List<Learner> learners) {
        this.learners = learners;
    }

    public String getCohortDescription() {
        return cohortDescription;
    }

    public void setCohortDescription(String cohortDescription) {
        this.cohortDescription = cohortDescription;
    }
}
