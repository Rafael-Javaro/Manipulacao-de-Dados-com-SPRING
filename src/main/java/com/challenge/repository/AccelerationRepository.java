package com.challenge.repository;

import com.challenge.entity.Acceleration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccelerationRepository extends JpaRepository<Acceleration, Long> {

    @Query("SELECT c.id.acceleration FROM Candidate c WHERE c.id.company.id = :companyId")
    List<Acceleration> findByCompanyId(Long companyId);
}
