package com.challenge.service;

import com.challenge.entity.Company;
import com.challenge.repository.CompanyRepository;
import com.challenge.service.interfaces.CompanyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService implements CompanyServiceInterface {

    @Autowired
    CompanyRepository repository;

    @Override
    public Optional<Company> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public List<Company> findByAccelerationId(Long accelerationId) {
        return this.repository.findByCandidatesIdAccelerationId(accelerationId);
    }

    @Override
    public List<Company> findByUserId(Long userId) {
        return this.repository.findByCandidatesIdUserId(userId);
    }

    @Override
    public Company save(Company object) {
        return this.repository.save(object);
    }
}
