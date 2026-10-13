package com.example.learnerManagement.service;

import com.example.learnerManagement.entity.Learner;
import com.example.learnerManagement.exception.EmailNotUniqueException;
import com.example.learnerManagement.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import com.example.learnerManagement.exception.LearnerNotFoundException;

import java.util.List;

@Service
public class LearnerService {

    @Autowired
    private LearnerRepository learnerRepository;

    public Learner createLearner(Learner learner) {
        try{
            return learnerRepository.save(learner);
        }catch (DataIntegrityViolationException e){
            throw new EmailNotUniqueException("Email must be unique. A learner with this email already exists.");
        }

    }

    public List<Learner> getAllLearners() {
        return learnerRepository.findAll();
    }

    public List<Learner> getLearners(String learnerName){
        if(learnerName == null){
            return learnerRepository.findAll();
        } else {
            return learnerRepository.findByLearnerName(learnerName);
        }
    }

    public Learner getLearnerById(Long id) {
        return learnerRepository.findById(id)
                .orElseThrow(() -> new LearnerNotFoundException("Learner not found with id: " + id));
    }
}

