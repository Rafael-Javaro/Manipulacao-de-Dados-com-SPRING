package com.challenge.repository;

import com.challenge.entity.Submission;
import com.challenge.entity.SubmissionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface SubmissionRepository extends JpaRepository<Submission, SubmissionId> {

    // https://pt.stackoverflow.com/questions/360081/como-buscar-o-menor-pre%C3%A7o-em-uma-entidade-com-spring-data-jpa-em-um-jparepositor
    @Query("SELECT max(s.score) FROM Submission s JOIN s.id.challenge c WHERE c.id = :challengeId")
    BigDecimal findHigherScoreByChallengeId(@Param("challengeId") Long challengeId);

    @Query("SELECT s FROM Submission s JOIN s.id.challenge c JOIN c.accelerations ac WHERE c.id = :challengeId AND ac.id = :accelerationId")
    List<Submission> findByChallengeIdAndAccelerationId(@Param("challengeId") Long challengeId, @Param("accelerationId") Long accelerationId);
}
