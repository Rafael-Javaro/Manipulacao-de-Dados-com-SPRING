package com.challenge.repository;

import com.challenge.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    List<Company> findByCandidatesIdAccelerationId(Long id);
    List<Company> findByCandidatesIdUserId(Long id);
}
