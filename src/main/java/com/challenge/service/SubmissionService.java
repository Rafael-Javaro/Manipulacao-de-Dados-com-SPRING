package com.challenge.service;

import com.challenge.entity.Submission;
import com.challenge.repository.SubmissionRepository;
import com.challenge.service.interfaces.SubmissionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SubmissionService implements SubmissionServiceInterface {

    @Autowired
    SubmissionRepository repository;

    @Override
    public Submission save(Submission object) {
        return this.repository.save(object);
    }

    @Override
    public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
        return this.repository.findHigherScoreByChallengeId(challengeId);
    }

    @Override
    public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
        return this.repository.findByChallengeIdAndAccelerationId(challengeId, accelerationId);
    }
}
