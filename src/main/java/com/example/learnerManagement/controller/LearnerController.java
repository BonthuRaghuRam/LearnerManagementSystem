package com.example.learnerManagement.controller;

import com.example.learnerManagement.entity.Learner;
import com.example.learnerManagement.service.LearnerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LearnerController {

    @Autowired
    private LearnerService learnerService;

    @PostMapping("/learners")
    public Learner createLearner(@Valid @RequestBody Learner learner) {
        return learnerService.createLearner(learner);
    }

    @GetMapping("/learners")
    public List<Learner> getAllLearners(@RequestParam(required = false) String learnerName) {
        return learnerService.getLearners(learnerName);
    }

    @GetMapping("/learners/{id}")
    public Learner getLearnerById(@PathVariable Long id) {
        return learnerService.getLearnerById(id);
    }

}
