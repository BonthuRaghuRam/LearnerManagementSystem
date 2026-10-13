package com.example.learnerManagement.repository;

import com.example.learnerManagement.entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LearnerRepository extends JpaRepository<Learner, Long> {
    List<Learner> findByLearnerName(String learnerName);
}
