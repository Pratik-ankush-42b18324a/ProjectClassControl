package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Submission;

public interface SubmissionRepository extends JpaRepository<Submission, Integer> {

}
